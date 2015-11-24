package com.manh.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountPhoneNumber
{
    private static Map<String, String> phonenumber = new HashMap<String, String>();

    public static void main(String[] args)
    {
        phonenumber.put("ABc", "123");
        phonenumber.put("bcd", "345");
        phonenumber.put("cda", "523");
        phonenumber.put("abc", "678");

        System.out.println(getNumber("ABc"));

        
    }
    
   

    public static StringBuilder getNumber(String s)
    {
        StringBuilder sb = new StringBuilder("Numbers are ");

        Set<String> names = phonenumber.keySet();
        for (String name : names)
        {
            if (s.equalsIgnoreCase(name))
            {
                sb.append(phonenumber.get(name) + ", ");
            }

        }

        return sb;
    }

}
