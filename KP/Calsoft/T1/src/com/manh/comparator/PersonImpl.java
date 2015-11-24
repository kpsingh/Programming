package com.manh.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonImpl

{
    public static void main(String[] args)
    {
        Person p1 = new Person(25,"Ravi","BE");
        Person p2 = new Person(5,"Mohan","CA");
        Person p3 = new Person(30,"Mohan","MBA");
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        
        System.out.println(p1.equals(p2));
        
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        
        
    }
}
