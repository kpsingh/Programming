package com.manh.java.basics;

public class Euro
{

}

class Money
{
    public String country = " Canada";
    
    public String getC()
    {
        return country;
    }
}

class Yes extends Money
{
   public String getC()
   {
      return super.country;
   }
}