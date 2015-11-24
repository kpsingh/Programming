package com.manh.concorrency.one;

import java.util.concurrent.Semaphore;

public class SFDemo
{
    public static boolean flag = true;
    
    public static void main(String[] args)
    {
        Semaphore sf = new Semaphore(1, true);
        
        PrintNumber p1 = new PrintNumber(sf, flag);
        PrintNumber p2 = new PrintNumber(sf, flag);
        
        new Thread(p1).start();
        new Thread(p2).start();
        
        
    }

}

class PrintNumber implements Runnable
{
    Semaphore sf;

    boolean flag;

    public PrintNumber(Semaphore sf, boolean flag)
    {
        this.sf = sf;
        this.flag = flag;
    }

    public void run()
    {
        while (true)
        {
            
            try
            {
                if (flag == true)
                {
                    sf.acquire();
                    
                    System.out.println("Odd");
                    Thread.sleep(200);
                    flag = false;
                                      
                }
                else
                {
                    sf.acquire();
                    System.out.println("Even");
                    Thread.sleep(200);
                    flag = true;
                }
            }
            
            catch (InterruptedException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            finally
            {
                sf.release();
            }
        }
    }

}