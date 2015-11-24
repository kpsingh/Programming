package com.manh.io2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class LineOrientedIO
{
    
    public static void main(String[] args)
    {
        BufferedReader in = null;
        PrintWriter out = null;
        
        try
        {
            in = new BufferedReader(new FileReader("C:/Workspace/Gander/Test/src/com/manh/io2/test.txt"));
            out = new PrintWriter (new FileWriter("C:/Workspace/Gander/Test/src/com/manh/io2/Copytest.txt"));
            
            String l;
            while((l= in.readLine()) != null)
            {
                out.write(l);
                System.out.println(l);
            }
            
        }
        catch (FileNotFoundException e) {
            // TODO: handle exception
        }
        catch (IOException e) {
            // TODO: handle exception
        }
        finally
        {
            if (in !=null)
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
            
        }
    }

}
