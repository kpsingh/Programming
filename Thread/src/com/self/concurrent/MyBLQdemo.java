package com.self.concurrent;

import java.util.Random;

public class MyBLQdemo {
	public static void main(String[] args)
	{
		MyBlockingQueue blq = new MyBlockingQueue(1);

		Producer p = new Producer(blq);
		Consumer c = new Consumer(blq);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		t1.start();
		t2.start();

	}

}

class Producer implements Runnable {
	MyBlockingQueue blq;

	public Producer(MyBlockingQueue blq) {
		this.blq = blq;
	}

	@Override
	public void run()
	{
		while (true)
		{
			int i = new Random().nextInt(100);
			try
			{
				blq.put(i);

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}
}

class Consumer implements Runnable {
	MyBlockingQueue blq;

	public Consumer(MyBlockingQueue blq) {
		this.blq = blq;
	}

	@Override
	public void run()
	{
		while (true)
		{
			try
			{
				blq.take();
				Thread.sleep(1000);

			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
