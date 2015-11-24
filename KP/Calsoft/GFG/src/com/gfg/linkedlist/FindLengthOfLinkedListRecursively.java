package com.gfg.linkedlist;

public class FindLengthOfLinkedListRecursively
{

    public static void main(String[] args)
    {
        MyLinkedList<Node> list = new MyLinkedList<Node>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.print();
        System.out.println();

        int lenght = findLengthRecursively(list.header);
        System.out.println(" Lenght of list is : " + lenght);

    }

    private static int findLengthRecursively(Node list)
    {
        if (list == null)
        {
            return 0;
        }

        int length = 1 + findLengthRecursively(list.next);
        return length;

    }

}
