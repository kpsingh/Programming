package com.manh.java.basics;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantProducerConsumer
{

    public static void main(String[] args)
    {
        

    }

}


class MyQueue
{
    Lock lock = new ReentrantLock();
    Condition notFull = lock.newCondition();
    Condition notEmpty = lock.newCondition();
    int size;
    
    public MyQueue(int size)
    {
        this.size = size;
    }
    
    
    public void put(Integer i)
    {/*
        lock.lock();
        for(int i = 0; i< size; i++)
        {
            
        }
        
    */}
   
    
}