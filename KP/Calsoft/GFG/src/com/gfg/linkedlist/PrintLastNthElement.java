package com.gfg.linkedlist;

public class PrintLastNthElement
{
    public static void main(String[] args)
    {
        MyLinkedList<Node> list = new MyLinkedList<Node>();
        list.add(1);
        list.add(12);
        list.add(33);
        list.add(45);
        list.add(55);
        list.add(6);
        list.add(7);
        list.print();
        System.out.println();
        prrintLastNthElement(list.header, 5);

    }

    private static void prrintLastNthElement(Node list, int i)
    {
        if (i <= 0)
        {
            return;
        }
        Node current = list;
        Node run = list;

        for (int j = 0; j < i; j++)
        {
            if (run == null)
            {
                return;
            }
            run = run.next;
        }

        while (run != null)
        {
            run = run.next;
            current = current.next;
        }
        System.out.println("Last " + i + " element is " + current.data);

    }

}
