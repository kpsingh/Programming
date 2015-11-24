package com.manh.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DuplicateCount
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int arr[] = {2,3,4,5,6,5,7,6,7,3,5,6,4};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i:arr){
            map.put(i, map.get(i)!=null?map.get(i)+1:1);
        }
        
        Set<Integer> set = map.keySet();
        for(int i: set){
            if(map.get(i) > 0){
                System.out.println("Total occurence of "+i+" is "+ map.get(i));
            }
        }
    }

}
