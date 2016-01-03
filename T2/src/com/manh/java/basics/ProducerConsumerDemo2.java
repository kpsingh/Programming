package com.manh.java.basics;

import java.util.LinkedList;
import java.util.Queue;

/*
 * This demo has been done based on the wait and notify.
 */
public class ProducerConsumerDemo2
{
    public static void main(String[] args)
    {
        Queue<Integer> sharedQueue = new LinkedList<Integer>();
        int size = 5;

        ProducerOne p = new ProducerOne(sharedQueue, size);
        ConsumerOne q = new ConsumerOne(sharedQueue, size);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(q);

        t1.start();
        t2.start();

    }

}

class ProducerOne implements Runnable
{
    Queue<Integer> sharedQueue;

    int size;

    public ProducerOne(Queue<Integer> sharedQueue, int size)
    {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public synchronized void run()
    {
        if (sharedQueue.size() == size)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (int i = 0; i < size; i++)
        {
            sharedQueue.add(i);
            System.out.println("Produced : " + i);

        }
        notify();

    }
}

class ConsumerOne implements Runnable
{
    Queue<Integer> sharedQueue;

    int size;

    public ConsumerOne(Queue<Integer> sharedQueue, int size)
    {
        this.sharedQueue = sharedQueue;
        this.size = size;
    }

    @Override
    public synchronized void run()
    {
        while (true)
        {
            if (sharedQueue.size() == 0)
            {
                try
                {
                    wait();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < size; i++)
            {
                System.out.println("Consumed : " + sharedQueue.remove());

            }
            notify();

        }

    }
}
