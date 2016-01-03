package com.manh.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo
{

    public static void main(String[] args)
    {
        CyclicBarrier cb = new CyclicBarrier(3);
        
        Thread t1 = new Thread(new AppCB(cb));
        Thread t2 = new Thread(new AppCB(cb));
        Thread t3 = new Thread(new AppCB(cb));
        
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
            t1.join();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Main Thread!");
        
        
    }

}

class AppCB implements Runnable
{
    private CyclicBarrier cb;
    
    public AppCB(CyclicBarrier cb)
    
    {
        this.cb =cb;
    }

    public void run()
    {
        try
        {
            System.out.println(Thread.currentThread().getName() +" is waiting the barrier!");
            cb.await();
            Thread.sleep(2000);
            System.out.println("How are you");
            System.out.println(Thread.currentThread().getName() +" is passed the barrier!");
          
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (BrokenBarrierException e)
        {
            e.printStackTrace();
        }
    }
}