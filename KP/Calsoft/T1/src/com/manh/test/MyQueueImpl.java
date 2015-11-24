package com.manh.test;

public class MyQueueImpl
{
    public static void main(String[] args)
    {
        MyQueue mq = new MyQueue(4);
        mq.add(5);
        mq.add(10);
        mq.add(20);
        mq.remove();
        mq.add(25);
        mq.add(30);
        mq.add(35);
        mq.remove();
        
    }

}
