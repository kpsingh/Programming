package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TestImpl {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
        int result = 0;
        for(int i = l; i<= r; i++)
            {
                int j = i;
                while(j <= r)
                    {
                    int temp = i^j;
                    j++;
                    if(temp > result)
                        {
                        result = temp;
                    }
                    
                }
            
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
