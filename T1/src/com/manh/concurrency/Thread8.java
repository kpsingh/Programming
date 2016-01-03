package com.manh.concurrency;

import java.util.Random;

public class Thread8
{
    public void producer() throws InterruptedException
    {
        synchronized (this)
        {
            System.out.println("Producer thread is running...");
            wait();
            System.out.println("Producer is ressumed");
        }

    }

    public void consumer() throws InterruptedException
    {
        Thread.sleep(3000);

        synchronized (this)
        {
            System.out.println("Consumer thread is running...");
            notify();
        }

    }

}
