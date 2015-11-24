package com.manh.concorrency.one;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable
{
    public static void main(String[] args)
    {
        Student st1 = new Student();
        st1.setAge(10);
        st1.setName("First");

        Student st2 = new Student();
        st1.setAge(20);
        st2.setName("Second");

        List<Student> plist = new ArrayList<Student>();
        plist.add(st1);
        plist.add(st2);

        Student st3 = new Student();
        st3.setAge(30);
        st3.setName("Final");
        st3.setPlist(plist);
        
        
        

    }
}

class Student implements Cloneable
{
    String name;

    int age;

    List<Student> plist;

    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public List<Student> getPlist()
    {
        return plist;
    }

    public void setPlist(List<Student> plist)
    {
        this.plist = plist;
    }

}