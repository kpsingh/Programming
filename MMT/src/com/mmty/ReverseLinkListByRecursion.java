package com.mmty;

import java.util.Iterator;

public class ReverseLinkListByRecursion
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(15);
        list.add(5);
        list.add(20);
        System.out.println(list.toString());
        list.reverse();
        System.out.println(list.toString());
    }

}

class LinkedList
{
    Node root;

    public void add(int value)
    {
        Node node = new Node(value);

        if (root == null)
        {
            root = node;
        }
        else
        {
            Node currentNode = root;
            while (currentNode.next != null)
            {
                currentNode = currentNode.next;
            }
            currentNode.next = node;
        }
    }

    public void reverse()
    {
        root = reverse(root);
    }

    public Node reverse(Node list)
    {
        if (list == null)
            return null; // first question

        if (list.next == null)
            return list; // second question

        // third question - in Lisp this is easy, but we don't have cons
        // so we grab the second element (which will be the last after we
        // reverse it)

        Node secondElem = list.next;

        // bug fix - need to unlink list from the rest or you will get a cycle
        list.next = null;

        // then we reverse everything from the second element on
        Node reverseRest = reverse(secondElem);

        // then we join the two lists
        secondElem.next = list;

        return reverseRest;
    }

    @Override
    public String toString()
    {
        String result = "";
        Node current = root;
        result = "" + current.data + ", ";

        while (current.next != null)
        {
            current = current.next;
            result += current.data + ", ";
        }
        return "List: " + result;
    }
}

class Node
{
    int data;

    Node next;

    public Node(int data)
    {
        this.data = data;
    }

}