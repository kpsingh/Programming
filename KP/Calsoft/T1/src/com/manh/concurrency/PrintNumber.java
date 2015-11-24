package com.manh.concurrency;

public class PrintNumber
{
    int value = 0;

    public void printOdd() throws InterruptedException
    {

        while (value < 50)
        {
            synchronized (this)
            {
                System.out.println("Odd  Value : " + ++value);
                //Thread.sleep(2000);
                this.wait();
            }

        }
    }

    public void printEven() throws InterruptedException
    {
        while (value < 50)
        {
            synchronized (this)
            {
                System.out.println("Even Value : " + ++value);
                this.notify();  
            }
           Thread.sleep(1000);
        }

    }

}
