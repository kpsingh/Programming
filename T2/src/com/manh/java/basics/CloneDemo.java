package com.manh.java.basics;

public class CloneDemo
{

    public static void main(String[] args) throws CloneNotSupportedException
    {
        Address address = new Address("BEML Layout");
        Student st = new Student();
        st.setAge(10);
        st.setName("Kamal");
        st.setAddress(address);
        
        System.out.println("Original: "+st.getAge() + " : " + st.getName() + " : "+ st.getAddress().getStreet());
        
        Student cloneStudent = (Student) st.clone();
        
        cloneStudent.getAddress().setStreet("Kundanhalli");
        
        System.out.println("Original: "+st.getAge() + " : " + st.getName() + " : "+ st.getAddress().getStreet());
        
        System.out.println("Cloned: "+cloneStudent.getAge() + " : " + cloneStudent.getName() + " : "+ cloneStudent.getAddress().getStreet());
        
        
    }
    
}
