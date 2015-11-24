package com.manh.concurrency;

import java.util.LinkedList;
import java.util.List;

public class PCByWN
{
    private LinkedList<Integer> list = new LinkedList<Integer>();

    private final int LIMIT = 1;

    // private Object lock = new Object();

    public void producer() throws InterruptedException
    {
        int value = 1;
        while (true)
        {
            synchronized (this)
            {
                while (list.size() == LIMIT)
                {
                    this.wait();
                }
                System.out.println("Produced : " + value);
                list.add(value++);
                this.notify();

            }
        }
    }

    public void consumer() throws InterruptedException
    {

        while (true)
        {
            synchronized (this)
            {
                while (list.size() == 0)
                {
                    this.wait();
                }
                int value = list.removeFirst();
                System.out.println("Consumed : " + value);
                Thread.sleep(2000);
                this.notify();

            }

        }
    }

}
