package com.gayle.lackman.arraystring;

public class ReplaceSpacewithSomeValue
{
    public static void main(String[] args)
    {
        String s = "Mr Jon Smith     ";
        replaceSpacewithSomeValue(s);
        
    }

    private static void replaceSpacewithSomeValue(String s)
    {
        char[] temp = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< 13-1; i++)
        {
            if(temp[i] != ' ')
            {
                sb.append(temp[i]);
            }
            else
            {
                sb.append("%20");
            }
        }
        
        System.out.println(sb.toString());
    }

}
