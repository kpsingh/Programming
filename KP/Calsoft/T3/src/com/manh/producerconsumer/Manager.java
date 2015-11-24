package com.manh.producerconsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Manager
{
    public static void main(String[] args)
    {
        BlockingQueue queue =  new ArrayBlockingQueue(5);
        
        Producer p = new Producer(queue);
        Condumer c = new Condumer(queue);
        
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        
        t1.start();
        t2.start();
        
        
    }

}
