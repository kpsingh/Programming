package com.manh.pc;

import java.util.Queue;

public class Consumer implements Runnable
{
    Queue sharedq;

    public Consumer(Queue<Object> sharedq)
    {
        this.sharedq = sharedq;
    }

    public void run()
    {
        synchronized (sharedq)
        {
            while (true)
            {
                if (sharedq.size() == 0)
                {

                    try
                    {
                        sharedq.wait();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                System.out.println("Consumed : " + sharedq.remove());
                sharedq.notify();
            }

        }
    }
}