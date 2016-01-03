package com.serious.programing;

import java.util.Comparator;

public class AgeComparator implements Comparator
{
    public int compare(Object o1, Object o2)
    {   
        Person p1 = (Person)o1;
        Person p2 = (Person) o2;
        
        return p1.age > p2.age ? 1 : (p1.age < p2.age) ? -1 : 0;
        
    }
}