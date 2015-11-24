package com.manh.amazon;

public class LongestSubStringPalindrome
{
    public static void main(String[] args)
    {
        String s = "aaaaabb";
        char[] arr = s.toCharArray();
        String palindrom = getLongestPalindrom(arr);
        System.out.println(palindrom);
    }

    public static String getLongestPalindrom(char arr[])
    {
        int index_start = 0;
        int index_end = 0;
        int longest = 1;

        for (int i = 1; i < arr.length; i++)
        {
            boolean flag = false;
            int begin = i;
            int end = i;

            while (!flag)
            {
                if (arr[begin] == arr[end])
                {
                    if (begin == 0 || end == arr.length - 1)
                    {
                        if ((end - begin) > longest)
                        {
                            longest = (end - begin);
                            index_start = begin;
                            index_end = end;
                        }
                        flag = true;
                    }
                    else
                    {
                        begin--;
                        end++;
                    }
                }
                else
                {
                    --end;
                    ++begin;

                    flag = true;
                    if ((end - begin) > longest)
                    {
                        longest = (end - begin);
                        index_start = begin;
                        index_end = end;
                    }

                }

            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = index_start; i <= index_end; i++)
        {
            sb.append(arr[i]);
        }

        System.out.println("index_start : " + index_start);
        System.out.println("index_end : " + index_end);
        return sb.toString();
    }

}
