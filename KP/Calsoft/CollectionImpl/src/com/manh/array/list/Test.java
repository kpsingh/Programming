package com.manh.array.list;

public class Test
{
    public static void main(String[] args)
    {
        ArrayListOne list = new ArrayListOne();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list);
        //list.add(6, 50);
        System.out.println(list);
        list.set(-1, 100);
        System.out.println(list);

    }
}
