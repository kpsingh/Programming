package com.manh.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable
{
    BlockingQueue queue;
    public Producer(BlockingQueue queue)
    {
        this.queue = queue;
    }
    
    public void run()
    {
        for(int i =0; i< 10; i++)
        {
            try
            {
                queue.put(i);
                System.out.println("Produced: " + i);
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
