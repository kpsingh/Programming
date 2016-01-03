package com.manh.pc;

import java.util.LinkedList;
import java.util.Queue;

public class PCImpl
{
    private static Queue<Object> sharedq = new LinkedList<Object> ();
    
    public static void main(String[] args)
    {
        
        Producer p =  new Producer(sharedq);
        Consumer c = new Consumer(sharedq);
        
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        
        t1.start();t2.start();
    }

}
