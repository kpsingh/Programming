package com.hcl.symentac;

import java.util.ArrayList;

/**
 * This class will help us to find the duplicates element in the array and also
 * help us to remove those elements.
 * 
 * @author Krishna Pratap Singh
 *
 */
public class RemoveDuplicateElementsFromArray {
	public static void main(String[] args)
	{
		int a[] = { 2, 3, 6, 6, 8, 9, 10, 10, 10, 12, 12 };
		System.out.println("Before");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		a = removeDuplicate(a);
		System.out.println("After");
		for (int i : a)
		{
			System.out.print(i + " ");
		}
	}

	public static int[] removeDuplicate(int a[])
	{
		int i = 1;
		int j = 0;

		ArrayList<Integer> dupsElemnt = new ArrayList<Integer>();

		while (i < a.length)
		{
			if (a[i] == a[j])
			{
				dupsElemnt.add(a[i]);
				i++;
			}
			else
			{
				a[++j] = a[i++];
			}
		}

		int result[] = new int[j + 1];

		for (int k = 0; k < result.length; k++)
		{
			result[k] = a[k];
		}
		System.out.println("Duplicates");

		for (int l = 0; l < dupsElemnt.size(); l++)
		{
			System.out.print(dupsElemnt.get(l) + " ");
		}
		System.out.println();

		return result;
	}
}
