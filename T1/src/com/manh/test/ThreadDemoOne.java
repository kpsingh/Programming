package com.manh.test;

public class ThreadDemoOne implements Runnable
{
    private static int counter;

    public static void main(String[] args)
    {
        ThreadDemoOne td1 = new ThreadDemoOne();
        ThreadDemoOne td2 = new ThreadDemoOne();

        Thread t1 = new Thread(td1, "Thread:1");
        Thread t2 = new Thread(td2, "Thread:2");
        t1.start();
        t2.start();
        System.out.println("Main Thread");

    }

    public void run()
    {
        counter();

    }

    public void counter()
    {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++)
        {
            try
            {
                Thread.sleep(1);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            counter++;
        }
        long end = System.currentTimeMillis();

        System.out.println(Thread.currentThread().getName() + " - " + (end - start));
        System.out.println(counter);
    }

}
