package com.manh.linked.list;

public class Manager
{
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.print();
        list.remove(15);
        System.out.println("");
        list.print();
        
    }

}
