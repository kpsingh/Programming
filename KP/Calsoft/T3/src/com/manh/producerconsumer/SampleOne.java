package com.manh.producerconsumer;

public class SampleOne implements Runnable
{
    private int test = 0;

    public static void main(String[] args) throws InterruptedException
    {
        SampleOne s1 = new SampleOne();

        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        System.out.println(s1.test);

    }

    public  void doCount()
    {
        for (int i = 0; i < 10000; i++)
        {
            test++;
        }
    }

    @Override
    public void run()
    {
        doCount();
    }

}
