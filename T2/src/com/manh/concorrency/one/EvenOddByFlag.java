package com.manh.concorrency.one;

import java.util.concurrent.Semaphore;

public class EvenOddByFlag
{
    public static Boolean flag = true;

    public static void main(String[] args)
    {
        PerformOperation po = new PerformOperation(flag);

        while (true)
        {
            po.doOperation();
        }
    }

}

class PerformOperation
{
    Boolean flag;

    public PerformOperation(Boolean flag)
    {
        this.flag = flag;
    }

    public void doOperation()
    {
        if (flag)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Odd");
            flag = false;
        }
        else
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("Even");
            flag = true;
        }
    }

}