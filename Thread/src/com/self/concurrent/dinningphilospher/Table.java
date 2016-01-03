package com.self.concurrent.dinningphilospher;

public class Table {
	private boolean[] usedForks;

	Table(int num) {
		usedForks = new boolean[num];
		for (int i = 0; i < num; i++)
		{
			usedForks[i] = false;
		}
	}

	private int left(int i)
	{
		return i;
	}

	private int right(int i)
	{
		return ++i < usedForks.length ? i : 0;
	}

	public synchronized void takeForks(int place)
	{
		while (usedForks[left(place)] || usedForks[right(place)])
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{

			}
		}
		usedForks[left(place)] = true;
		usedForks[right(place)] = true;

	}

	public synchronized void putForks(int place)
	{
		usedForks[left(place)] = false;
		usedForks[right(place)] = false;
		notifyAll();
	}

}
