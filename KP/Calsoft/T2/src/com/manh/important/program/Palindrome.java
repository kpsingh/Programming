package com.manh.important.program;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Palindrome
{
    public Set<String> palindromesDistinct(String input)
    {

        final Set<String> result = new HashSet<String>();

        for (int i = 0; i < input.length(); i++)
        {
            // even length
            expandPalindromes(result, input, i, i + 1);
            // odd length:
            expandPalindromes(result, input, i, i);
        }
        return result;
    }

    public void expandPalindromes(final Set<String> result, final String s, int i, int j)
    {
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j))
        {
            result.add(s.substring(i, j + 1));
            i--;
            j++;
        }
    }

    public static void main(String[] args)
    {
        Palindrome p = new Palindrome();
        Set<String> pSet = p.palindromesDistinct("aabaa");
        System.out.println("Number of Palindromes:" + pSet.size());
        Iterator<String> str = pSet.iterator();
        while (str.hasNext())
        {
            System.out.println(str.next());
        }
    }

}
