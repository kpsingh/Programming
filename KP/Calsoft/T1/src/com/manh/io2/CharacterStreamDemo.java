package com.manh.io2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo
{

    public static void main(String[] args)
    {

        FileReader in = null;
        FileWriter out = null;

        try
        {
            in = new FileReader("C:/Workspace/Gander/Test/src/com/manh/io2/test.txt");
            out = new FileWriter("C:/Workspace/Gander/Test/src/com/manh/io2/Copytest.txt");

            int c;

            while ((c = in.read()) != -1)
            {
                out.write(c);
            }

        }
        catch (FileNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (IOException e)
        {
            // TODO: handle exception
        }
        finally
        {
            if (in != null)
            {
                try
                {
                    in.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            
            
            if (out != null)
            {
                try
                {
                    out.close();
                }
                catch (IOException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

    }

}
