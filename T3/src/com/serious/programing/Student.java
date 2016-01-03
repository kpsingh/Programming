package com.serious.programing;

public class Student implements Cloneable
{
    String name;
    Address address;
    
    public Student(String name, String address)
    {
        this.name = name;
        this.address = new Address(address);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setAddress(Address address)
    {
        this.address = address;
    }
    
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
    
    public String toString()
    {
        return "Name:" + name +", " + address;
    }
    
}
