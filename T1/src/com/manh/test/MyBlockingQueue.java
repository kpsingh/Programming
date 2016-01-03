package com.manh.test;

import java.util.LinkedList;
import java.util.Queue;

public class MyBlockingQueue
{
    private int capacity;

    private Queue<Integer> q;

    public MyBlockingQueue(int capacity)
    {
        this.capacity = capacity;
        q = new LinkedList<Integer>();

    }

    public synchronized void put(Integer element)
    {
        while (q.size() == capacity)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        q.add(element);
        notify();
    }

    public synchronized Integer get()
    {
        while (q.size() == 0)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }

        Integer element = q.remove();
        notify();
        return element;

    }

}
