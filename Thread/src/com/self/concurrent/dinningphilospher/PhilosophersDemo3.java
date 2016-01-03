package com.self.concurrent.dinningphilospher;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PhilosophersDemo3 {

	private static final int size = 5;

	private static int leftOf(int i)
	{
		return i;
	}

	private static int rightOf(int i)
	{
		return (i + 1) % size;
	}

	public static void main(String[] args)
	{
		Spoon[] sp = new Spoon[size];

		for (int i = 0; i < size; i++)
		{
			sp[i] = new Spoon();
		}

		Ph[] ph = new Ph[size];
		for (int i = 0; i < size; i++)
		{
			Spoon left = sp[leftOf(i)];
			Spoon right = sp[rightOf(i)];
			ph[i] = new Ph(left, right, i);

		}
		
		for(int i = 0; i< size; i++)
		{
			ph[i].start();
		}
	}
}

class Ph extends Thread {
	private Spoon left;
	private Spoon right;
	private int position;

	public Ph(Spoon left, Spoon right, int position) {
		this.left = left;
		this.right = right;
		this.position = position;
	}

	public void run()
	{
		while (true)
		{
			eat();
		}
	}

	public void eat()
	{
		System.out.println("Philospher " + position + ": thinking!");
		pause();
		System.out.println("Philospher " + position + ": start eating!");

		if (pickUp())
		{
			chew();
			putDown();
		}
		else
		{
			System.out.println("Philospher " + position
					+ ": gave up on eating!");
		}
	}

	public boolean pickUp()
	{
		if (!left.pickUp())
		{
			return false;
		}
		if (!right.pickUp())
		{
			left.putDown();
			return false;
		}
		return true;
	}

	public void putDown()
	{
		left.putDown();
		right.pickUp();
	}

	public void chew()
	{
		pause();
		System.out.println("Philospher " + position + ": done eating!");
	}

	public void pause()
	{
		try
		{
			Thread.sleep((long) (Math.random() * 20000));
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}

class Spoon {
	private Lock lock;

	public Spoon() {
		lock = new ReentrantLock();
	}

	public boolean pickUp()
	{
		return lock.tryLock();
	}

	public void putDown()
	{
		lock.unlock();
	}
}