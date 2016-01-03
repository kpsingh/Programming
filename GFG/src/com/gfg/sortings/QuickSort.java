package com.gfg.sortings;

public class QuickSort {
	public static void main(String[] args)
	{
		int a[] = { 12, 1,0, 9, 11, 3, 17, 5 };

		sort(a);
		for (int i : a)
		{
			System.out.println(i);
		}

	}

	public static void sort(int a[])
	{
		sort(a, 0, a.length - 1);

	}

	private static void sort(int a[], int start, int end)
	{
		if (start > end)
			return;

		int pIndex = partition(a, start, end);
		sort(a, start, pIndex - 1);
		sort(a, pIndex + 1, end);

	}

	private static int partition(int a[], int start, int end)
	{
		int pivot = a[end];
		int pIndex = start;

		for (int i = start; i < end; i++)
		{
			if (a[i] < pivot)
			{
				swap(a, pIndex, i);
				pIndex++;
			}
		}

		swap(a, pIndex, end);
		return pIndex;
	}

	private static void swap(int a[], int pIndex, int i)
	{
		int temp = a[pIndex];
		a[pIndex] = a[i];
		a[i] = temp;
	}

}
