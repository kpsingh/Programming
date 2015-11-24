package com.manh.comparator;

import java.util.Arrays;

public class TestArray
{
    public static void main(String[] args)
    { 
        // You have an arrray where only one element is same.
       int temp[] = {2,2,2,2,2,9,2,2};
       
        
        for(int i = 0; i<temp.length-1 ; i = i+2)
        {
            System.out.println(temp[i] ^ temp[i+1]);
            
            
        }
        
        
    }

}
