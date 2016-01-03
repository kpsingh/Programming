package com.manh.test;

public class MyConsumer implements Runnable
{
    private MyBlockingQueue q;

    public MyConsumer(MyBlockingQueue q)
    {
        this.q = q;
    }

    public void run()
    {
        while(true)
        {
            System.out.println("Consumed : " + q.get());
            
        }
       

    }

}
