package com.manh.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
/*
 * These are the four ways to print the element of any Map. Get the Key set and Entry set and then use for each loop and Iterator.
 */
public class WayToIterateMap
{

    public static void main(String[] args)
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("Home Loan", "ICICI Bank");
        map.put("Education Loan", "Allahabad Bank");
        map.put("Peronal Loan", "HDFC Bank");
        
        System.out.println("Way One");
        for(String key : map.keySet())
        {
            
            System.out.println( key +" : "+ map.get(key));
        }
        
        Iterator<String > it = map.keySet().iterator();
        
        System.out.println("Way Two");
        while(it.hasNext())
        {
            String key = it.next();
            
            System.out.println( key +" : "+ map.get(key));
        }
        
        System.out.println("Way Three");
        for(Entry entry : map.entrySet())
        {
         System.out.println(entry.getKey() + " : "+ entry.getValue());   
        }
        
        Iterator<Entry<String, String>> it1 = map.entrySet().iterator();
        System.out.println("Way Four");
        while (it1.hasNext())
        {
            Entry entry = it1.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        
        
        }
        
        
    }
    
    
}
