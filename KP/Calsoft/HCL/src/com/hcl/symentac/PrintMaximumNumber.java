	package com.hcl.symentac;
	
	public class PrintMaximumNumber {
		public static void main(String[] args)
		{
			int a[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
	
			int rowNumber = getRowWithMaxEntry(a);
			System.out.println(rowNumber);
	
		}
	
		public static int getRowWithMaxEntry(int[][] a)
		{
			int count = 0;
			int tempCount = 0;
			int result[] = { 0, 0, 0 };
	
			for (int i = 0; i < a.length; i++)
			{
				for (int j = 0; j < a[i].length; j++)
				{
	
					if (a[i][j] == 1)
					{
						tempCount++;
					}
				}
	
				if (count < tempCount)
				{
					count = tempCount;
					result[i] = count;
					tempCount = 0;
				}
			}
	
			count = 0;
			tempCount = 0;
			int index = 0;
	
			for (int i = 0; i < result.length; i++)
			{
				tempCount = result[i];
				
				if(count < tempCount)
				{
					count = tempCount;
					index = i;
				}
			}
			
			return index;
		}
	}
