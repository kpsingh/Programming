package com.manh.test;

public class DemoThread extends Thread
{

    public DemoThread(ThreadDemoOne td1)
    {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args)
    {
        DemoThread dm1 = new DemoThread(null);
        dm1.setName("Demo Thread 1");
        DemoThread dm2 = new DemoThread(null);
        dm2.setName("Demo Thread 2");
        /*
         * DemoThread dm3 = new DemoThread(); DemoThread dm4 = new DemoThread();
         * DemoThread dm5 = new DemoThread();
         */

        dm1.start();
        dm2.start();
        /*
         * dm3.start(); dm4.start(); dm5.start();
         */
    }

    @Override
    public void run()
    {
        startRun();
    }

    public void startRun()
    {

        for (int i = 1; i <= 100; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            if (i == 100)
            {
                System.out.println(Thread.currentThread().getName() + " has won the race");
                
                // System.exit(0);
            }
        }

    }

}
