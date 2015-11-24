package com.manh.concurrency;

public class App
{
    public static void main(String[] args) throws InterruptedException
    {
        final PrintNumber pc= new PrintNumber();
        System.out.println(Runtime.getRuntime().availableProcessors());
        
        Thread t1 = new Thread ( new Runnable(){
            @Override
            public void run()
            {
                try
                {
                    pc.printOdd();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
                
        );
        
        Thread t2 = new Thread ( new Runnable(){
            @Override
            public void run()
            {
                try
                {
                    pc.printEven();
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                
            }
        }
                
        );
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
    }
    
}
