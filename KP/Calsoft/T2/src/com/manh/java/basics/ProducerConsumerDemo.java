package com.manh.java.basics;

public class ProducerConsumerDemo
{
    public static void main(String[] args)
    {
        int queue = 0;

        Producer p = new Producer(queue);
        Consumer q = new Consumer(queue);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(q);

        t1.start();
        t2.start();

    }

}

class Producer implements Runnable
{
    private int queue;

    public Producer(int queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        synchronized (this)
        {
            for (int i = 0; i < 10; i++)
            {
                System.out.println("Produced : " + i);
            }

        }

    }
}

class Consumer implements Runnable
{
    private int queue;

    public Consumer(int queue)
    {
        this.queue = queue;
    }

    @Override
    public void run()
    {
        synchronized (this)
        {
            for (int i =0; i< 10 ; i++)
            {
                System.out.println("Consumed : " + i);
            }
            
        }
        

    }
}
