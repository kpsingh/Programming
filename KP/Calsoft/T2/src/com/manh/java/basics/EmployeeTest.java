package com.manh.java.basics;

public class EmployeeTest
{

}

class Person
{
    String name = "No Name";

    public Person(String nm)
    {
        name = nm;
    }

}

class Employee extends Person
{
    String empId = "0000";
    public Employee(String id)
    {
       super(id);
        empId = id;
    }

   
    
   
    
}