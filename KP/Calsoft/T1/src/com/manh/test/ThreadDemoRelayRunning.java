package com.manh.test;

public class ThreadDemoRelayRunning implements Runnable
{

    public static void main(String[] args)
    {
        ThreadGroup india = new ThreadGroup("India");
        ThreadGroup us = new ThreadGroup("USA");
        ThreadGroup japan = new ThreadGroup("Japan");
        ThreadGroup china = new ThreadGroup("China");
        ThreadGroup russia = new ThreadGroup("Russia");

        ThreadDemoRelayRunning runner1 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner2 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner3 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner4 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner5 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner6 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner7 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner8 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner9 = new ThreadDemoRelayRunning();
        ThreadDemoRelayRunning runner10 = new ThreadDemoRelayRunning();

        Thread t1 = new Thread(india, runner1, "Ind - 1");
        Thread t2 = new Thread(india, runner2, "Ind - 2");
        Thread t3 = new Thread(us, runner3, "USA - 1");
        Thread t4 = new Thread(us, runner4, "USA -2");
        Thread t5 = new Thread(japan, runner5, "Jpn - 1");
        Thread t6 = new Thread(japan, runner6, "Jpn - 2");
        Thread t7 = new Thread(russia, runner7, "RSA - 1");
        Thread t8 = new Thread(russia, runner8, "RSA - 2");
        Thread t9 = new Thread(china, runner9, "Cn - 1");
        Thread t10 = new Thread(china, runner10, "Cn - 2");

        t1.run();
        t2.run();
        t3.run();
        t4.run();
        t5.run();
        t6.run();
        t7.run();
        t8.run();
        t9.run();
        t10.run();
        

    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 400; i++)
        {
            if (i == 200)
            {
               
            }

        }

    }

}
