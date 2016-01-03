package com.self.concurrent;

public class EvenOddWithWaitNotify {
	public static void main(String[] args)
	{
		PrintOddEven pn = new PrintOddEven();

		Print even = new Print(pn, 20, true);
		Print odd = new Print(pn, 20, false);

		Thread t1 = new Thread(even);
		Thread t2 = new Thread(odd);

		t1.start();
		t2.start();

	}

}

class Print implements Runnable {

	PrintOddEven pn;
	int max;
	int min;
	boolean isEven;

	Print(PrintOddEven pn, int max, boolean isEven) {
		this.pn = pn;
		this.max = max;
		this.isEven = isEven;
	}

	public void run()
	{
		min = (isEven) ? 2 : 1;

		while (min < max)
		{
			if (isEven)
			{
				pn.printEven(min);
			}
			else
			{
				pn.printOdd(min);
			}
			min += 2;
		}
	}

}

class PrintOddEven {
	boolean isOdd = false;

	public synchronized void printEven(int num)
	{
		if (!isOdd)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

		System.out.println("Even : " + num);
		isOdd = false;
		notify();
	}

	public synchronized void printOdd(int num)
	{
		if (isOdd)
		{
			try
			{
				wait();
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Odd : " + num);
		isOdd = true;
		notify();

	}
}
