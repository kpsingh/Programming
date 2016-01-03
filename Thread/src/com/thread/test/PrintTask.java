package com.thread.test;

public class PrintTask implements Runnable
{
    int max;

    EvenOddPrinter evenOddPrinter = null;

    boolean isEven;

    int num = 0;

    public PrintTask(EvenOddPrinter evenOddPrinter, int max, boolean isEven)
    {
        this.evenOddPrinter = evenOddPrinter;
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
                evenOddPrinter.printEven(num);

            }
            else
            {
                evenOddPrinter.printOdd(num);

            }
            num = num + 2;
        }

    }

}
