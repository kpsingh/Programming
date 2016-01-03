package com.gfg.linkedlist;

public class MyLinkedList<T>
{
    Node header = null;

    int size = 0;

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
            Node curretNode = header;

            while (curretNode.next != null)
            {
                curretNode = curretNode.next;
            }
            curretNode.next = node;
            size++;
        }

    }

    public int getSize()
    {
        return size;
    }
    
    public void print()
    {
        if(header == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            Node currNode = header;
            while(currNode != null)
            {
                System.out.print(" " + currNode.data);
                currNode = currNode.next;
            }
        }
      
    }

}
