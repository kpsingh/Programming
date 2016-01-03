package com.manh.comparator;

public class Person implements Comparable
{
    int age;
    String name;
    String qualification;
    
    public Person(int age, String name, String qualification)
    {
        this.age = age;
        this.name = name;
        this.qualification = qualification;
        
    }
    public Person()
    {
        // TODO Auto-generated constructor stub
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getQualification()
    {
        return qualification;
    }

    public void setQualification(String qualification)
    {
        this.qualification = qualification;
    }
    
    public String toString()
    {
        return "Age : "+ age + ", Name : " + name + ", Qlualification : " + qualification;
    }
    
    public boolean equals(Object obj)
    {
        if (obj != null && obj instanceof Person)
        {
            Person p = (Person) obj;
            return this.name == p.name && this.age == p.age && this.qualification == p.qualification;
        }
        return false;  
    }

    @Override
    public int hashCode()
    {
        int code = 5;
        
        return 5*code*this.age + this.name.hashCode();
    }
    
   
    public int compareTo(Object obj)
    {
        if (obj != null)
        {
            Person p = (Person) obj;
            return this.age > p.age ? 1 : (this.age < p.age ? -1 : 0);
        }
        return -1;
    }
    
    
}
