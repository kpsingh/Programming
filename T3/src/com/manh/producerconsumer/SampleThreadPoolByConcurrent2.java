package com.manh.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleThreadPoolByConcurrent2
{
    public static void main(String[] args)
    {
        ExecutorService exe = Executors.newFixedThreadPool(5);
        for(int i = 0; i< 100; i++)
        {
            B b = new B(i);
            exe.submit(b);
        }
        exe.shutdown();
    }
}

class B implements Runnable
{
    int i;

    public B(int i)
    {
        this.i = i;
    }

    public void run()
    {
        System.out.println("Job No. " + i + ", by " + Thread.currentThread().getName());
    }
}