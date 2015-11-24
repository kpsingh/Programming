package com.manh.test;

public class MyProducer implements Runnable
{
    private MyBlockingQueue sharedq;

    public MyProducer(MyBlockingQueue sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            sharedq.put(i);
            System.out.println("Produced : " + i);
            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
