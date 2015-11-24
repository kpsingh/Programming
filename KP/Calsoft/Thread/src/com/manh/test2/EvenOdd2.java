package com.manh.test2;

public class EvenOdd2
{
    public static void main(String[] args)
    {
        PrintJob pj = new PrintJob();

        Thread t1 = new Thread(new Job(pj, 20, false));
        Thread t2 = new Thread(new Job(pj, 20, true));

        t1.start();
        t2.start();

    }

}

class Job implements Runnable
{
    PrintJob pj = null;

    int max;

    int num = 0;

    boolean isEven;

    public Job(PrintJob pj, int max, boolean isEven)
    {
        this.pj = pj;
        this.max = max;
        this.isEven = isEven;
    }

    public void run()
    {
        // Important part
        num = (isEven) ? 2 : 1;

        while (num <= max)
        {
            if (isEven)
            {
                pj.printEven(num);
            }
            else
            {
                pj.printOdd(num);
            }

            num = num + 2;

        }
    }

}

class PrintJob
{
    boolean isOdd = false;

    public synchronized void printEven(int num)
    {
        if (!isOdd)
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

        System.out.println("Even: " + num);
        isOdd = false;
        notify();

    }

    public synchronized void printOdd(int num)
    {
        if (isOdd)
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

        System.out.println("Odd: " + num);
        isOdd = true;
        notify();

    }

}