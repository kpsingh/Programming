package com.manh.java.basics;

public class Bar extends Foo
{
    public int a;
    
    public Bar()
    {
        a += 8;
    }
    
    public void addFive()
    {
        this.a += 5;
       // System.out.println(this.a);
    }
    
    public static void main(String[] args)
    {
        Foo foo = new Bar();
        foo.addFive();
        System.out.println(foo.a);
        
        
    }

}

class Foo
{
    public int a;
    
    public Foo()
    {
        a = 3;
    }
    
    public void addFive()
    {
        a += 5;
    }
   
}