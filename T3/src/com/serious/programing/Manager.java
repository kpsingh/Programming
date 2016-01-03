package com.serious.programing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Manager
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person p1 = new Person("Vinod", 25);
        Person p2 = new Person("Tarun", 3);
        Person p3 = new Person("Krishna", 25);
        Person p4 = new Person("Ajay", 28);
        Person p5 = new Person("Mohit", 23);

        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);
        plist.add(p4);
        plist.add(p5);

        Iterator it = plist.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
            it.remove();
        }
        System.out.println("**** After Sorting ****");
        System.out.println(plist);

    }
}
