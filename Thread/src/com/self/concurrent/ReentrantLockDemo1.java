package com.self.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo1 implements Runnable {

	int count;
	
	private final ReentrantLock lock = new ReentrantLock();

	public static void main(String[] args) throws InterruptedException
	{
		ReentrantLockDemo1 a1 = new ReentrantLockDemo1();
		// ReentrantLockDemo1 a2 = new ReentrantLockDemo1();

		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a1);

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		a1.printCount();

	}

	public void run()
	{
		increaseConunt();

	}

	public void printCount()
	{
		System.out.println(count);
	}

	public void increaseConunt()
	{
		lock.lock();
		try
		{
			for (int i = 0; i < 10000; i++)
			{
				count++;
			}
		} finally
		{
			lock.unlock();
		}

	}

}
