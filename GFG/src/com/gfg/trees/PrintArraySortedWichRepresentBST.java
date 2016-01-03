package com.gfg.trees;

public class PrintArraySortedWichRepresentBST {
	public static void main(String[] args)
	{
		int a[] = {4,2,5,1,3};
		
		printSorted(a, 0,a.length-1);
		
	}
	public static void printSorted(int []a, int start, int end)
	{
		if(start > end)
			return;
		
		printSorted(a,(start*2 + 1), end);
		System.out.print(a[start]+" ");
		printSorted(a,(start*2 + 2), end);
		
	}

	
}
