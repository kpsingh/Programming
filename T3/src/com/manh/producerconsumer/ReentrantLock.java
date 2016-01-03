package com.manh.producerconsumer;

import java.util.concurrent.locks.Lock;

public class ReentrantLock implements Runnable
{
    int count;

    Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public static void main(String[] args)
    {
        ReentrantLock re = new ReentrantLock();

        Thread t1 = new Thread(re);
        Thread t2 = new Thread(re);
        t1.start();
        t2.start();

    }

    public void run()
    {
        doCount();
    }

    private void doCount()
    {
        try
        {
            lock.lock();

            for (int i = 0; i < 10000; i++)
            {
                count++;
            }

            System.out.println(count);
        }
        finally
        {
            lock.unlock();
        }

    }
}
