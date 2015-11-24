package com.manh.concorrency.one;

public class Palindrom
{
    public static void main(String[] args)
    {
        String s = "kamak";
        char[]str = s.toCharArray();
        System.out.println(isPlaindrome(str));
    }
    
    
    static boolean  isPlaindrome(char[] str) {
        int n = str.length;
        for(int i = 0, j = n - 1; i < j; ++i, --j) {
            if(str[i] != str[j]) return false;
        }
            return true;
    }

}
