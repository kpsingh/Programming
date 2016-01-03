package com.manh.linked.list;

public class LinkedList
{
    private int size = 0;

    private Node header;

    public void add(int data)
    {
        Node node = new Node(data);

        if (header == null)
        {
            header = node;
            size++;
        }
        else
        {
            Node currentNode = header;

            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }

            currentNode.next = node;
            size++;
        }
    }

    public void remove(int data)
    {
        if (header == null)
        {
            return;
        }
        else if (header.data == data)
        {
            header = header.next;
        }
        else
        {
            Node currentNode = header;

            while (currentNode.next != null)
            {
                if (currentNode.next.data == data)
                {
                    currentNode.next = currentNode.next.next;
                    size--;
                }
                currentNode = currentNode.next;
            }
        }

    }

    public int size()
    {
        return size;
    }

    public void print()
    {
        Node temp = header;

        while (temp != null)
        {
            System.out.print(" " + temp.data);
            temp = temp.next;
        }

    }

}
