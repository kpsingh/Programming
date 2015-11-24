package com.manh.test;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable

{
    private final BlockingQueueDemo sharedq;

    public Consumer(BlockingQueueDemo sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        while (true)
        {

            System.out.println("Consumed: " + sharedq.get());

        }

    }
}
