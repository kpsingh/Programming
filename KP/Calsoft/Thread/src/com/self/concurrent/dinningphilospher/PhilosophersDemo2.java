package com.self.concurrent.dinningphilospher;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
 * Gayle Lackeman example of Dining Philosopher problem.
 */
public class PhilosophersDemo2 {

	public static int size = 5;

	public static int leftOf(int i)
	{
		return i;
	}

	public static int rightOf(int i)
	{
		return (i + 1) % size;
	}

	public static void main(String[] args)
	{
		Chopstick[] chopsticks = new Chopstick[size];
		for (int i = 0; i < size; i++)
		{
			chopsticks[i] = new Chopstick();
		}

		Philosopher[] philosophers = new Philosopher[size];
		for (int i = 0; i < size; i++)
		{
			Chopstick left = chopsticks[leftOf(i)];
			Chopstick right = chopsticks[rightOf(i)];
			philosophers[i] = new Philosopher(i, left, right);
		}

		for (int i = 0; i < size; i++)
		{
			philosophers[i].start();
		}
	}

}

class Chopstick {

	private Lock lock;

	public Chopstick() {
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

/*
 * Philosopher class where each Philosopher will have its number and its left and
 * right Chopstick.
 */
class Philosopher extends Thread {

	private Chopstick left;
	private Chopstick right;
	private int index;

	public Philosopher(int i, Chopstick left, Chopstick right) {
		index = i;
		this.left = left;
		this.right = right;
	}

	public void eat()
	{
		System.out.println("Philosopher " + index + ": thinking!");
		pause();
		System.out.println("Philosopher " + index + ": start eating");
		if (pickUp())
		{
			chew();
			putDown();
			System.out.println("Philosopher " + index + ": done eating");
		}
		else
		{
			System.out.println("Philosopher " + index + ": gave up on eating");
		}
	}

	public boolean pickUp()
	{
		pause();
		if (!left.pickUp())
		{
			return false;
		}
		pause();
		if (!right.pickUp())
		{
			left.putDown();
			return false;
		}
		pause();
		return true;
	}

	public void chew()
	{
		System.out.println("Philosopher " + index + ": eating");
		pause();
	}

	public void pause()
	{
		try
		{
			int pause = (int) (Math.random() * 10000);
			Thread.sleep(pause);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public void putDown()
	{
		left.putDown();
		right.putDown();
	}

	public void run()
	{
		while (true)
		{
			eat();
		}
	}
}
