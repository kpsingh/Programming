package com.serious.programing;

public class Address
{
    String streetName;
    
    public Address(String streetName)
    {
        this.streetName = streetName;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String toString()
    {
        return "Address : " + streetName;
    }
    
}
