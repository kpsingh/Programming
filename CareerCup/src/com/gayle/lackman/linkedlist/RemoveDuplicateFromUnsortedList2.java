package com.gayle.lackman.linkedlist;

import java.util.LinkedList;

public class RemoveDuplicateFromUnsortedList2
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(8);
        list.add(18);
        list.add(10);
        list.add(8);
        list.add(12);
        list.add(10);
        System.out.println("Before");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print("\t" + list.get(i));
        }
        list = removeDuplicate(list);
        System.out.println("");
        System.out.println("After");
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print("\t" + list.get(i));
        }
    }

    private static LinkedList<Integer> removeDuplicate(LinkedList<Integer> list)
    {
        LinkedList<Integer> header = list;
        
        
        return null;
    }
}
