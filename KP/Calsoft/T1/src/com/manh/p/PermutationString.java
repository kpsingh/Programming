package com.manh.p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PermutationString
{

    public static List<String> permutationList = new ArrayList<String>();
    public static int count = 0;
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        List<String> permutationList = getPermutationString("abc");
        Collections.sort(permutationList);
        for(String s: permutationList){
            System.out.println(s);
        }
        System.out.println("Count: " + count);
    }
    
 public static List<String> getPermutationString(String str){
        //permutationList.add(str);
       // String temp = str;
        char t1;
        char[] s1 = str.toCharArray();
        for(int i=0; i<s1.length; i++){
            for(int j=i+1; j<s1.length;j++){
                t1 = s1[i];
                s1[i] = s1[j];
                s1[j] = t1;
                count++;
                //permutationList.add(String.valueOf(s1));
                if(!permutationList.contains(String.valueOf(s1))){
                    permutationList.add(String.valueOf(s1));
                    getPermutationString(String.valueOf(s1));
                }else {
                    return permutationList;
                }
            }
            break;
        }
        
        return permutationList;
    }

}
