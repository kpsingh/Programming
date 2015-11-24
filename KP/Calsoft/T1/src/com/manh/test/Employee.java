package com.manh.test;

public class Employee
{
    int emp_id;

    String name;

    public Employee()
    {
        // TODO Auto-generated constructor stub
    }

    public Employee(int emp_id, String name)
    {
        this.emp_id = emp_id;
        this.name = name;
    }

    public int getEmp_id()
    {
        return emp_id;
    }

    public void setEmp_id(int emp_id)
    {
        this.emp_id = emp_id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        // TODO Auto-generated method stub
        return "Emp_Id: " + emp_id + " and Name :" + name;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + emp_id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {

        if (obj != null)
        {
            if (obj instanceof Employee)
            {
                Employee e = (Employee) obj;
                return (this.emp_id == e.emp_id && this.name == e.name);
            }
        }
        return false;
    }
}
