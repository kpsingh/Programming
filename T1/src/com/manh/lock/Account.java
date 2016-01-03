package com.manh.lock;

public class Account
{

    static int total_amount = 1000;

    public void credit(int amount)
    {
        total_amount = total_amount + amount;
    }

    public void debit(int amount)
    {
        total_amount = total_amount - amount;

    }
    
    public void transfer(int amount, Account acc1, Account acc2)
    {
        acc1.credit(amount);
        acc2.debit(amount);
    }
    
    public int total()
    {
        return total_amount;
    }


}
