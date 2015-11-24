package com.manh.test;

public class MyQueue
{
    /*
     * front, rear, add, remove, size,
     */

    int front = 0;

    int rear = 0;

    int size;

    Object arr[];

    public MyQueue(int size)
    {
        this.size = size;
        arr = new Object[size];

    }

    public void add(Object a)
    {
        if (rear == arr.length)
        {
            System.out.println("Queue is overflow, no more elements are allowed");
        }
        else
        {
            arr[rear] = a;
            rear++;
            System.out.println("Element " + a+ " has been added");
          

        }
    }

    public void remove()
    {
        if (rear == 0)
        {
            System.out.println("Queue is underflow, no elements can be deleted");
        }
        else
        {
           System.out.println("Index "+ front +" Elemnt " + arr[front] + " has been deleted");
           arr[front]= null;
           front++;
        }

    }

}
