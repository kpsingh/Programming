package com.manh.test;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
    private final BlockingQueueDemo sharedq;

    public Producer(BlockingQueueDemo sharedq)
    {
        this.sharedq= sharedq;
    }

    
    public void run()
    {
        for(int i=1; i<=10;i++)
        {
            try
            {
                sharedq.put(i);
                System.out.println("Produced: " + i);
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        
    }
}
