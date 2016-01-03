package com.test.math;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class RedundantParanthesis
{
    public static void main(String[] args)
    {
        String expr = "(((a+b))";

        Boolean flag = isRedundant(expr.toCharArray());
        System.out.println(flag);

    }

    public static boolean isRedundant(char[] s)
    {
        // Stack<Character> stack = new Stack<Character>();
        Deque<Character> stack = new ArrayDeque<Character>();
        for(int i= 0; i< s.length; i++)
        {
            char temp = s[i];
            if(temp == '(')
            {
                stack.push(temp);
            }
            if(temp == ')')
            {
                stack.pop();
            }
        }
        System.out.println(stack);

        return stack.size() > 0 ? true : false;
    }
}
