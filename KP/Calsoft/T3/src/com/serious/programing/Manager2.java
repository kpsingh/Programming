package com.serious.programing;

public class Manager2
{
    public static void main(String[] args) throws CloneNotSupportedException
    {

        Student s = new Student("Tarun","Pulsor");
        Student s2 = (Student)s.clone();
        
        System.out.println(s);
        System.out.println(s2);
        
        
        System.out.println(s);
        System.out.println(s2);
    }
}
