package com.manh.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo
{
    public static void main(String[] args) throws IOException
    {
        Student st = new Student(1, "Vinod");
        try
        {
            FileOutputStream fos = new FileOutputStream("student.sr");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(st);
            oos.close();
            fos.close();

        }
        catch (FileNotFoundException e)
        {

            e.printStackTrace();
        }

    }

}

class Student implements Serializable
{
    int id;

    String name;

    public Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public Student()
    {
        // TODO Auto-generated constructor stub
    }

}