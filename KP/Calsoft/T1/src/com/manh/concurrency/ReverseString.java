package com.manh.concurrency;

public class ReverseString
{
    
    public static void main(String []args)
    {
        String s = "abc";
      //  System.out.println(s.length());
        char[] c = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        
        while(i < j)
        {
            Character temp = c[i];
            c[i]= c[j];
            c[j]= temp;
            i++;
            j--;
        }
        System.out.println(c);
        
        
    }
    

}
