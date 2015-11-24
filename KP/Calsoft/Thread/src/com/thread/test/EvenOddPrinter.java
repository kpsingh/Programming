package com.thread.test;

public class EvenOddPrinter
{
    boolean isOdd = false;

    public synchronized void printEven(int number)
    {
        while (!this.isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Even Numner :" + number);
        this.isOdd = false;
        notify();

    }

    public synchronized void printOdd(int number)
    {
        while (this.isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println("Odd Numner :" + number);
        this.isOdd = true;
        notify();

    }

}
