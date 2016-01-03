package com.thread.test;

public class A
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new B());
        Thread t2 = new Thread(new B());

        System.out.println(Thread.currentThread().getName());
        t1.run();
        t2.run();

    }

}

class B implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}