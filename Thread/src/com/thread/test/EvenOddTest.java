package com.thread.test;

public class EvenOddTest
{
    public static void main(String[] args)
    {
        EvenOddPrinter p = new  EvenOddPrinter();
        
        Thread t1 = new Thread(new PrintTask(p,20,true));
        Thread t2 = new Thread(new PrintTask(p,20,false));
        t1.start();
        t2.start();
        
    }

}
