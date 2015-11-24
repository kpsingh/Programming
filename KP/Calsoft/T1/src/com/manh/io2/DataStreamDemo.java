package com.manh.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamDemo
{
    static final String datafile = "invoicedata";

    static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };

    static final int[] units = { 12, 8, 13, 29, 50 };

    static final String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin",
            "Java Key Chain" };

    public static void main(String[] args) throws IOException
    {

        DataInputStream in = null;
        DataOutputStream out = null;

        try
        {
            for (int i = 0; i < prices.length; i++)
            {
                out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(datafile)));
                out.writeDouble(prices[i]);
                out.writeInt(units[i]);
                out.writeUTF(descs[i]);

                in = new DataInputStream(new BufferedInputStream(new FileInputStream(datafile)));

                double price;
                int unit;
                String desc;
                double total = 0.0;

                while (true)
                {
                    price = in.readDouble();
                    unit = in.readInt();
                    desc = in.readUTF();

                    System.out.format("You ordered %d" + " units of %s at $%.2f%n", unit, desc,
                            price);
                    total += unit * price;
                }
            }

        }
        catch (EOFException e)
        {
            System.out.println(" Exception is coming...");
            e.printStackTrace();
        }

    }
}
