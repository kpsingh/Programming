package com.manh.test;

public class EqualAndHashCodeTest
{

    public static void main(String[] args)
    {
        Employee emp1 = new Employee(1, "Krishna");
        System.out.println(emp1.hashCode());
        Employee emp2 = new Employee(2, "Krishna");
        System.out.println(emp2.hashCode());
        Employee emp3 = emp1;
        System.out.println(emp3.hashCode());

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.equals(emp3));

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

    }

}
