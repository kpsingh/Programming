package com.self.concurrent;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockingQueue {

	private final ReentrantLock lock = new ReentrantLock();
	private Condition notfull;
	private Condition notEmpty;
	private Integer[] queue;
	private int front;
	private int rear;

	MyBlockingQueue(int length) {
		queue = new Integer[length];
		front = -1;
		rear = -1;
		notfull = lock.newCondition();
		notEmpty = lock.newCondition();
	}

	public void put(int data) throws InterruptedException
	{
		lock.lock();

		try
		{
			if ((rear + 1) % queue.length == front)
			{
				notfull.await();
			}
			else if (isEmpty())
			{
				rear++;
				front++;
				queue[rear] = data;
				System.out.println("Produced : " + data);
				notEmpty.signal();
			}
			else
			{
				rear = (rear + 1) % queue.length;
				queue[rear] = data;
				System.out.println("Produced : " + data);
				notEmpty.signal();
			}

		} finally
		{
			lock.unlock();
		}
	}

	public void take() throws InterruptedException
	{
		lock.lock();
		int data = 0;
		try
		{
			if (isEmpty())
			{
				notEmpty.await();
			}
			else if (rear == front)
			{
				data = queue[front];
				System.out.println("Consumed : " + data);
				front = -1;
				rear = -1;
				notfull.signal();
			}
			else
			{
				data = queue[front];
				System.out.println("Consumed : " + data);
				front = (front + 1) % queue.length;
				notfull.signal();
			}

		}

		finally
		{
			lock.unlock();

		}

	}

	public boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}

}
