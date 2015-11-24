package com.manh.pc;

import java.util.Queue;

public class Producer implements Runnable
{
    Queue sharedq;

    int capacity = 10;

    public Producer(Queue<Object> sharedq)
    {
        this.sharedq = sharedq;
        
    }

    @Override
    public void run()
    {
        synchronized (sharedq)
        {
            while (sharedq.size() == capacity)
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

            for (int i = 1; i < capacity; i++)
            {
                sharedq.add(i);
                System.out.println("Produced : " + i);
                try
                {
                    Thread.sleep(500);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                sharedq.notify();

            }
        }
    }
}
