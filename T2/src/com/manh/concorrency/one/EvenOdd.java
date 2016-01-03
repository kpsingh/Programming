package com.manh.concorrency.one;

import java.util.concurrent.Semaphore;

public class EvenOdd
{
    public static void main(String[] args)
    {
        Semaphore binary = new Semaphore(1);

        Even e = new Even(binary);
        Odd o = new Odd(binary);

        Thread t1 = new Thread(o);
        Thread t2 = new Thread(e);

        t1.start();
        t2.start();

    }

}

class Even implements Runnable
{
    Semaphore binary;

    public Even(Semaphore binary)
    {
        this.binary = binary;
    }

    public void run()
    {
        for (int i = 2; i < 11; i = i + 2)
        {

            try
            {
                binary.acquire();
                System.out.println("Even :" + i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            finally
            {
                binary.release();
            }
        }

    }
}

class Odd implements Runnable
{
    Semaphore binary;

    public Odd(Semaphore binary)
    {
        this.binary = binary;
    }

    public void run()
    {
        for (int i = 1; i < 12; i = i + 2)
        {

            try
            {
                binary.acquire();
                System.out.println("Odd :" + i);
                Thread.sleep(2000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            finally
            {
                binary.release();
            }
        }

    }
}