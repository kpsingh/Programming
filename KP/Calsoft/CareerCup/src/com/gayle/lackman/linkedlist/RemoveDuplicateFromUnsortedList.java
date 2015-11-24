package com.gayle.lackman.linkedlist;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.ListIterator;

public class RemoveDuplicateFromUnsortedList
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
        if (!list.isEmpty())
        {
            Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
            ListIterator<Integer> it = list.listIterator();

            while (it.hasNext())
            {
                int t = it.next();
                if (!table.containsKey(t))
                {
                    table.put(t, true);
                }
                else
                {
                    it.remove();
                }

            }

        }

        return list;
    }

}
