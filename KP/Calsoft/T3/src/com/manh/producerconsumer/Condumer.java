package com.manh.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Condumer implements Runnable
{
    BlockingQueue queue;

    public Condumer(BlockingQueue queue)
    {
        this.queue =queue;
    }
    
    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("Consumed: " + queue.take());
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
