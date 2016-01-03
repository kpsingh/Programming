package com.manh.test;

public class PandCByMyBlockingQueue
{

    public static MyBlockingQueue q = new MyBlockingQueue(5);
    
    public static void main(String[] args)
    {
        MyProducer p = new MyProducer(q);
        MyConsumer c = new MyConsumer(q);
        
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        
        t1.start();
        t2.start();        
        
        
    }
    
}


