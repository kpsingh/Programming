package com.manh.test2;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Print p = new Print();

        PrintIt even = new PrintIt(p, 20, false);
        PrintIt odd = new PrintIt(p, 20, true);

        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);

        t1.start();
        t2.start();
    }

}

class PrintIt implements Runnable
{
    int max;

    int num = 0;

    Print print;

    boolean isEven;

    public PrintIt(Print print, int max, boolean isEven)
    {
        this.print = print;
        this.max = max;
        this.isEven = isEven;
    }

    public void run()
    {
        num = (isEven) ? 2 : 1;
        while (num <= max)
        {
            if (isEven)
            {
                print.printEven(num);
            }
            else
            {
                print.printOdd(num);
            }
            num += 2;
        }

    }
}

class Print
{
    boolean isOdd = false;

    public synchronized void printEven(int num)
    {
        while (!isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }

        }
        System.out.println("Even " + num);
        this.isOdd = false;
        notify();

    }

    public synchronized void printOdd(int num)
    {
        while (isOdd)
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Odd  " + num);
        this.isOdd = true;
        notify();

    }
}
