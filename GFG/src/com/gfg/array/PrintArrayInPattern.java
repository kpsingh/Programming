package com.gfg.array;
/*
 * given an array[] = {1, 2, 3, 4, 5, 6};
write a program to print following output(not by hit and trial):

1
1	2	
1	2	3	
1	2	3	4	
1	2	3	4	5	
1	2	3	4	5	6	
2	
2	3	
2	3	4	
2	3	4	5	
2	3	4	5	6	

3	
3	4	
3	4	5	
3	4	5	6	

4	
4	5	
4	5	6	

5	
5	6	

6	
 */

public class PrintArrayInPattern {
	public static void main(String[] args)
	{
		int a[] =  {1, 2, 3, 4, 5, 6};
		
		print(a);
	}

	private static void print(int a[])
	{
		for(int i = 0; i< a.length; i++)
		{
			System.out.println(a[i]);
			
			for(int j= i+1; j< a.length; j++)
			{
				System.out.print(a[i] );
				for(int k = i+1; k<= j; k++)
				{
					System.out.print("\t " +a[k]);
					//System.out.println();
				}
				System.out.println();
				
			}
		}
	}
}
