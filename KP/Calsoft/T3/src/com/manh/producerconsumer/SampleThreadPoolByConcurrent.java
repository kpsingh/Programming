package com.manh.producerconsumer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleThreadPoolByConcurrent
{
    public static void main(String[] args)
    {

        ExecutorService exeService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 100; i++)
        {
            A a = new A(i);

            exeService.execute(a);

        }

        exeService.shutdown();

    }

}

class A implements Runnable
{
    int i;

    public A(int i)
    {
        this.i = i;
    }

    public void run()
    {
        System.out.println("Job No. " + i + ", by " + Thread.currentThread().getName());
    }
}
