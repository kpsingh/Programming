package com.manh.test;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueueDemo
{
    private int capacity;

    Queue<Integer> q;

    public BlockingQueueDemo(int capacity)
    {
        q = new LinkedList<Integer>();
        this.capacity = capacity;
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

