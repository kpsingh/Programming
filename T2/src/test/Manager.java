package test;

public class Manager extends A
{
    public static void main(String[] args)
    {
       
        
    }
    
 // Static is removed here (Causes Compiler Error) 
    public static void display() {
        System.out.println("Non-static method from Derived");
    }
     
    // Static is added here (Causes Compiler Error) 
    public  void print() {
        System.out.println("Static method from Derived");
   }

}

class A
{
 // Static method in base class which will be hidden in subclass 
    public static void display() {
        System.out.println("Static or class method from Base");
    }
     
     // Non-static method which will be overridden in derived class 
     public void print()  {
         System.out.println("Non-static or Instance method from Base");
    }

}
