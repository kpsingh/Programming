package com.manh.wigiland;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Test
{
    public static void main(String args[]) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        if (N <= 0)
        {
            System.out.println("Not OK");
        }
        for (int i = 0; i < N; i++)
        {
            line = br.readLine();
            System.out.println(checkCriteria(line));
        }

    }

    public static String checkCriteria(String str)
    {

        if (str.length() <= 0 || str == null)
        {
            return "Not OK";
        }
        HashSet<Character> charSet = new HashSet<Character>();
        char strToArray[] = str.toCharArray();

        int count = 0;
        int max_count_so_far = 1;
        Character lastCharacter = strToArray[0];
        charSet.add(lastCharacter);

        int index = 1;

        for (; index < strToArray.length; index++)
        {

            if (lastCharacter == strToArray[index])
            {
                count++;

            }
            else
            {
                count++;
                max_count_so_far = (count > max_count_so_far) ? count : max_count_so_far;
                count = 0;
                break;
            }

            lastCharacter = strToArray[index];

        }

        for (; index < strToArray.length; index++)
        {

            if (lastCharacter == strToArray[index])
            {
                count++;

            }
            else if (lastCharacter != strToArray[index] && !charSet.contains(strToArray[index]))
            {

                if (count > 0 && count > max_count_so_far)
                {
                    return "Not OK";
                }
                charSet.add(strToArray[index]);
                count = 1;
            }
            else
            {
                return "Not OK";
            }

            lastCharacter = strToArray[index];
        }

        if (charSet.size() == 3)
            return "OK";
        else
            return "Not OK";

    }
}
