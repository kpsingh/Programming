package com.hcl.symentac;

import java.util.Arrays;

public class QueueImplementation {
	public static void main(String[] args)
	{
		CustomQueue q = new CustomQueue(5);
		
		q.enQueue(5);
		q.enQueue(4);
		q.enQueue(9);
		q.enQueue(45);
		q.enQueue(15);
		System.out.println(q.toString());
		System.out.println("Element deleted : " +q.deQueue());
		q.enQueue(2);
		System.out.println(q.toString());
		System.out.println("Element deleted : " +q.deQueue());
		System.out.println("Element deleted : " +q.deQueue());
		System.out.println("Element deleted : " +q.deQueue());
		System.out.println("Element deleted : " +q.deQueue());
		System.out.println("Element deleted : " +q.deQueue());
	
		

	}

}

class CustomQueue {
	
	private int front;
	private int rear;
	private Object[] queue;

	public CustomQueue(int size) {
		queue = new Object[size];
		front = -1;
		rear = -1;
	}

	private boolean isEmpty()
	{
		return (front == -1 && rear == -1);
	}

	public void enQueue(int value)
	{
		if ((rear + 1) % queue.length == front)
		{
			throw new IllegalStateException("Can't add, Queue is already full");
		}
		else if (isEmpty())
		{
			front++;
			rear++;
			queue[rear] = value;
		}
		else
		{
			rear = (rear + 1) % queue.length;
			queue[rear] = value;
		}
	}

	public int deQueue()
	{
		int value = 0;

		if (isEmpty())
		{
			throw new IllegalStateException(
					"Can't remove, Queue is already empty");
		}
		else if (front == rear)
		{
			value = (Integer) queue[front];
			front = -1;
			rear = -1;
		}
		else
		{
			value = (Integer) queue[front];
			front = (front + 1) % queue.length;
		}

		return value;
	}

	@Override
	public String toString()
	{
		return "Queue [front=" + front + ", rear=" + rear + ", size=" + queue.length
				+ ", queue=" + Arrays.toString(queue) + "]";
	}
}
