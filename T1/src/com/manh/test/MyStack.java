package com.manh.test;

import java.util.Arrays;

/*
 * Array implementation of Stack
 */
public class MyStack
{

    int top = -1;

    int size = 0;

    Object arr[];

    static int capacity = 5;

    MyStack()
    {
        arr = new Object[capacity];
    }

    public void push(Object element)
    {
        if (top < capacity)
        {
            top++;
            arr[top] = element;
            System.out.println("Element " + element + " Has beeen added in " + top + " position");
            size++;

        }
        if (top + 1 == capacity)
        {
            System.out.println("Increasing the capacity");
            capacity = capacity * 2;
            Object tempArray[] = arr;
            arr = new Object[capacity];
            for (int i = 0; i < tempArray.length; i++)
            {
                arr[i] = tempArray[i];
            }

        }

    }

    public void pop()
    {
        // It will delete the top most element of the Array.

        if (size > 0)
        {
            System.out.println("Elemen " + arr[top] + " has been deleted");
            arr[top] = null;
            top--;
            size--;
        }
        else
        {
            System.out.println("Stack is empty, you can't pop the element");
        }
    }

    public Object top()
    {
        if (top > -1)
        {

            return arr[top];
        }
        else
        {
            System.out.println("Stack is empty");
            return null;
        }
    }

    public void printElement()
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.println(i + " Elemet = " + arr[i]);
        }
    }

    public static void main(String[] args)
    {

        MyStack ms = new MyStack();
        ms.push(15);
        ms.push(20);
        ms.push(25);
        ms.pop();
        ms.printElement();

    }

}
