package com.manh.lock;

public class App
{

    public static void main(String[] args) throws InterruptedException
    {
        final AccountHandeler ah = new AccountHandeler();
        
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run()
            {
                ah.firstRun();
                
            }
        });
        
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run()
            {
                ah.secondRun();
                
            }
        });
        
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
        
        ah.last();
        
        
    }
}
