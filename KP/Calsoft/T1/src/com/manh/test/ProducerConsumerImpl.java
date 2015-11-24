package com.manh.test;

import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;

public class ProducerConsumerImpl
{

    public static void main(String[] args)
    {
        BlockingQueueDemo sharedq = new BlockingQueueDemo(5);

        Producer p = new Producer(sharedq);
        Consumer q = new Consumer(sharedq);

        Thread t2 = new Thread(q);

        Thread t1 = new Thread(p);
     

        t1.start();
        t2.start();

    }
}
