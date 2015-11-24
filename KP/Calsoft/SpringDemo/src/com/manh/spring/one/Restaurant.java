package com.manh.spring.one;

import java.util.List;

public class Restaurant
{
    List<String> listOfWaiters;

    public void setListOfWaiters(List<String> listOfWaiters)
    {
        this.listOfWaiters = listOfWaiters;
    }
    
    public void displayListOfWaiters()
    {
        System.out.println(listOfWaiters);
    }
    

}
