package com.manh.java.basics;

public class Student implements Cloneable
{
    String name;

    int age;

    Address address;

    public Student(String name, int age, String add)
    {
        this.name = name;
        this.age = age;
        address = new Address(add);

    }

    public Student()
    {
        // TODO Auto-generated constructor stub
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

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        Student s = new Student(name, age, address.getStreet());
        return s;
    }
}
