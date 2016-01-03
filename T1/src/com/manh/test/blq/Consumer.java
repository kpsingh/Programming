package com.manh.test.blq;

public class Consumer implements Runnable
{

    private MyBlockingQueue sharedq;

    public Consumer(MyBlockingQueue sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        while (true)
        {

            System.out.println("Consumed : " + sharedq.take());
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }

}
