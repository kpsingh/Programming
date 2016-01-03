package com.manh.amazon;

import java.util.LinkedList;

public class AddTwoNumbersRepresentedbyLinkedLists
{
    static int carry;
    static int index = 0;

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(5);
        list.add(6);
        list.add(3);

        LinkedList list2 = new LinkedList();
        list2.add(8);
        list2.add(4);
        list2.add(2);

        LinkedList result = new LinkedList();

        int length1 = list.size();
        int length2 = list2.size();
        
        while(index<=list.size() && index<= list2.size())
        {
            for (int i = 0; i < length1; i++)
            {
                int temp = 0;

                temp = (Integer) list.get(i) + (Integer) list2.get(i) + carry;
                carry = 0;
                if (temp >= 10)
                {
                    temp = temp % 10 + carry;
                    carry = 1;
                    result.add(temp);

                }
                else
                {
                    result.add(temp);
                }
            }
        }
        
        while (index<=list.size())

       /* if (length1 >= length2)
        {
            for (int i = 0; i < length1; i++)
            {
                int temp = 0;

                temp = (Integer) list.get(i) + (Integer) list2.get(i) + carry;
                carry = 0;
                if (temp >= 10)
                {
                    temp = temp % 10 + carry;
                    carry = 1;
                    result.add(temp);

                }
                else
                {
                    result.add(temp);
                }
            }
        }
        else
        {

            for (int i = 0; i < length2; i++)
            {
                int temp = 0;

                temp = (Integer) list.get(i) + (Integer) list2.get(i);
                if (temp >= 10)
                {
                    temp = temp % 10 + carry;
                    carry = 1;
                    result.add(temp);

                }
                else
                {
                    result.add(temp + carry);

                }
            }
        
        }*/

        System.out.println(result);

    }
}
