package com.manh.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyByte
{
    public static void main(String[] args) throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;
        try
        {
            in = new FileInputStream("C:/Workspace/Gander/Test/src/com/manh/io/hello.txt");
            out = new FileOutputStream("C:/Workspace/Gander/Test/src/com/manh/io/copyhello.txt");
            int c;

            while ((c = in.read()) != -1)
            {
                out.write(c);
            }
        }

        finally
        {
            if (in != null)
            {
                in.close();
            }

            if (out != null)
            {
                in.close();
            }

        }
    }

}
