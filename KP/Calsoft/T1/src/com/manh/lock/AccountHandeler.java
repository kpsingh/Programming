package com.manh.lock;

public class AccountHandeler
{
    Account acc1 = new Account();
    Account acc2 = new Account();
    
    
    public void firstRun()
    {
        for (int i = 0 ; i< 1000; i++)
        {
            acc1.transfer(i, acc1, acc2);
        }
    }
    
    public void secondRun()
    {
        
       /* for (int i = 0 ; i< 1000; i++)
        {
            acc1.transfer(i, acc2, acc1);
        }*/
        
    }
    
    public void last()
    {
        System.out.println("Account 1 balance : " + acc1.total());
        System.out.println("Account 2 balance : " + acc2.total());
        System.out.println("Total balance : " + (acc1.total() + acc2.total()));
        
    }
    
}
