package com.serious.programing;

public class Person implements Cloneable
{

    String name;
    Integer age;

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public Person()
    {
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

    public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Person other = (Person) obj;

        if (age == null)
        {
            if (other.age != null)
            {
                return false;
            }
        }
        else if (!age.equals(other.age))
        {
            return false;
        }

        if (name == null)
        {
            if (other.name != null)
            {
                return false;
            }
        }
        else if (!name.equals(other.name))
        {
            return false;
        }

        return true;

    }

    public int hashCode()
    {
        final int prime = 31;
        int result = 1;

        result = result * prime + ((age == null) ? 0 : age.hashCode());
        result = result * prime + ((name == null) ? 0 : name.hashCode());

        return result;

    }

    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

    public String toString()
    {
        return "Age : " + age + ", Name : " + name;
    }

 /*   public int compareTo(Object o)
    {
        if (o == null)
            throw new NullPointerException("Compared Object can't be null");

        Person p = (Person) o;

        return this.name.compareTo(p.name);
    }*/

}
