package com.gfg.array;

public class PaskalTriangel {
	

	
	public static void main(String[] args)
	{
		int n = 5;
		
		printPascal(n);
	}
	
	public static void printPascal(int n)
	{
	  for (int line = 1; line <= n; line++)
	  {
	    int C = 1;  // used to represent C(line, i)
	    for (int i = 1; i <= line; i++)  
	    {
	      System.out.print(C + " "); // The first value in a line is always 1
	      C = C * (line - i) / i;  
	    }
	    System.out.println();
	  }
	}
	
/*
 * public static void printPascal(int n)
	{
		for (int line = 1; line <= n; line++)
		{
			for (int k = 1; k <= line; k++)
			{
				int result = fact(line) / ( (fact(line - k) * fact(k))); 
				System.out.print(result + " ");
			}
			System.out.println();
		}
	}

	private static int fact(int num)
	{
		if (num <= 1)
		{
			return num;
		}

		if (a[num] == 0)
		{
			a[num] = num * fact(num - 1);
		}
		return a[num];
	}
 */

}
