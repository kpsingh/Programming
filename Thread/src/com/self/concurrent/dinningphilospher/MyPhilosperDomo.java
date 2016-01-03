package com.self.concurrent.dinningphilospher;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyPhilosperDomo {

	private static int SIZE = 5;

	private ISpoon[] sp = new ISpoon[SIZE];
	private MyPH[] ph = new MyPH[SIZE];

	public static void main(String[] args)
	{
		MyPhilosperDomo mph = new MyPhilosperDomo();
		mph.start();

	}

	private void start()
	{
		for (int i = 0; i < SIZE; i++)
		{
			sp[i] = new ISpoon();
		}

		for (int i = 0; i < SIZE; i++)
		{
			ISpoon left = sp[leftof(i)];
			ISpoon right = sp[rightOf(i)];

			ph[i] = new MyPH(left, right, i);
		}

		for (int i = 0; i < SIZE; i++)
		{
			ph[i].start();
		}

	}

	private int leftof(int i)
	{
		return i;
	}

	private int rightOf(int i)
	{
		return (i + 1) % SIZE;
	}

}

class MyPH extends Thread {
	ISpoon left;
	ISpoon right;
	int position;

	public MyPH(ISpoon left, ISpoon right, int position) {
		this.left = left;
		this.right = right;
		this.position = position;
	}

	public void run()
	{
		while (true)
		{
			think();
			eat();
		}
	}

	public void eat()
	{
		System.out.println("Philospher " + position + ": Start eating");
		if (pickUp())
		{
			pause();
			System.out.println("Philospher " + position + ": Finished eating");
			putDown();

		}
		else
		{
			System.out
					.println("Philospher " + position + ": Give up on eating");
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
		right.putDown();
	}

	public void think()
	{
		System.out.println("Philospher " + position + ": Thinking!");
		pause();
	}

	public void pause()
	{
		try
		{
			Thread.sleep(3000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class ISpoon {

	Lock lock;

	public ISpoon() {

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