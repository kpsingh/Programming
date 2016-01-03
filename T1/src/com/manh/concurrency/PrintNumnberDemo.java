package com.manh.concurrency;

public class PrintNumnberDemo
{
    
    public static void main(String []args) throws InterruptedException
    {
        final PrintNaturalNumber n = new PrintNaturalNumber();
        
        Thread t1 = new Thread(new Runnable ()
        {
            public void run(){
                try
                {
                    n.printOdd();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        
        
        Thread t2 = new Thread( new Runnable (){
            public void run()
            {
                try
                {
                    n.printEven();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
    }

}
