package com.manh.java.basics;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerByReenttrantLock
{
    public static void main(String[] args)
    {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

        P p = new P(queue);
        C1 c = new C1(queue);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();

    }

}

class P implements Runnable
{
    BlockingQueue<Integer> queue;

    public P(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Produced : " + i);
            try
            {
                queue.put(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}

class C1 implements Runnable
{
    BlockingQueue<Integer> queue;

    public C1(BlockingQueue<Integer> queue)
    {
        this.queue = queue;
    }

    public void run()
    {
        while (true)
        {
            try
            {
                System.out.println("Consumed : " + queue.take());
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }

    }
}
