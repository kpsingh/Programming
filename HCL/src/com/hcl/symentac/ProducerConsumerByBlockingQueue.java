package com.hcl.symentac;

import java.lang.reflect.AnnotatedElement;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerByBlockingQueue {
	public static void main(String[] args)
	{
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(1);

		Producer p = new Producer(queue);
		Consumer q = new Consumer(queue);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(q);

		t1.start();
		t2.start();
	}

}

class Producer implements Runnable {
	BlockingQueue<Integer> queue;

	Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run()
	{
		while(true)
		{
			try
			{
				int i = new Random().nextInt(10);
				queue.put(i);
				System.out.println("Produced : " + i);
				//Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}

class Consumer implements Runnable {
	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	public void run()
	{
		while (true)
		{
			try
			{
				System.out.println("Consumed : " + queue.take());
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				e.printStackTrace();
			}

		}
	}
}