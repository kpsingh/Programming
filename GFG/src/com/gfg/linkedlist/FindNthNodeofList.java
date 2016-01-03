package com.gfg.linkedlist;

public class FindNthNodeofList
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
        printNthNode(list.header, 2);

    }

    private static void printNthNode(Node list, int n)
    {
        int count = 0;
        if (list == null)
        {
            System.out.println("List is empty");
        }

        Node currentNode = list;
        while (currentNode != null)
        {
            count++;
            if (count == n)
            {
                System.out.println(" " +currentNode.data);
                return;
            }
            currentNode = currentNode.next;

        }

    }

}
