package com.manh.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo
{

    public static void main(String[] args)
    {
        CountDownLatch latch = new CountDownLatch(3);

        /*
         * Create other three threads and let them finish then only main thread
         * can start working.
         */

        Thread t1 = new Thread( new App("Service1", 100, latch));
        Thread t2 = new Thread( new App("Service2", 100, latch));
        Thread t3 = new Thread( new App("Service3", 100, latch));
        
        t1.start();
        t2.start();
        t3.start();
        
        
        try
        {
            System.out.println("Countdown is : "+ latch.getCount() + ", Can't start main thread untill count down is 0!");
            latch.await();
            System.out.println("Countdown is : "+ latch.getCount() + ", Main Thread is starting now!");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}

class App implements Runnable
{
    String serviceName;
    int sleeptime;
    CountDownLatch latch;

    
    public App(String serviceName, int sleeptime, CountDownLatch latch)
    {
        this.serviceName = serviceName;
        this.sleeptime = sleeptime;
        this.latch = latch;
    }
    public void run()
    {
        try
        {
            Thread.sleep(sleeptime);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(serviceName + " is up!");
        
        latch.countDown();
        
    }
}
