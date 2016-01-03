package com.gfg.linkedlist;

public class FindLoopInLinkedList
{
    public static void main(String[] args)
    {
        // 2, 0, 6, 3, 1, 6, 3, 1
        MyLinkedList<Node> list = new MyLinkedList<Node>();
        list.add(2);
        list.add(0);
        list.add(6);
        list.add(3);
        list.add(1);
        list.add(6);
        list.add(3);
        list.add(1);
        list.print();
        System.out.println();

        System.out.println(isCyclic(list.header));
    }

    private static boolean isCyclic(Node list)
    {
        if (list == null)
            return false;
        Node tortois = list;
        Node hare = list;

        while (hare != null && hare.next != null)
        {
            tortois = tortois.next;
            hare = hare.next.next;
            if (tortois == hare)
            {
                return true;
            }
        }
        return false;

    }

}
