package com.manh.concurrency;

public class PrintNaturalNumber
{

    public void printEven() throws InterruptedException
    {
        int i = 2;
        synchronized (this)
        {
            while (i < 100)
            {
                System.out.println("Printing Even : " + i);
                i = i + 2;
                wait();
            }
        }
    }

    public void printOdd() throws InterruptedException
    {
        int i = 1;

        while (i < 100)
        {
            synchronized (this)
            {

                System.out.println("Printing Odd : " + i);
                i = i + 2;
                notify();

            }

        }
    }

}
