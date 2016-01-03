package com.manh.test2;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo
{
    public static void main(String[] args)
    {
        CountDownLatch latch = new CountDownLatch(2);
        Thread t1 = new Thread(new Service(latch, 1000, "Security"));
        Thread t2 = new Thread(new Service(latch, 1000, "Services"));

        t1.start();
        t2.start();

        try
        {
            latch.await();
            System.out.println("All Services are up!");
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        
        
    }

}

class Service implements Runnable
{
    int sleepTime;

    String name;

    private final CountDownLatch latch;

    public Service(CountDownLatch latch, int sleepTime, String name)
    {
        this.latch = latch;
        this.sleepTime = sleepTime;
        this.name = name;
    }

    @Override
    public void run()
    {
        try
        {
            Thread.sleep(sleepTime);
        }
        catch (InterruptedException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(name + " is Up!");
        latch.countDown();

    }
}
