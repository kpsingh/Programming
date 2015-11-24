import java.util.Scanner;

public class Test {
	public static void main(String[] args)
	{
		int arr[] = {80, 2, 6, 3, 100};
		System.out.println(findMaxDiff(arr));

	}

	private static int findMaxDiff(int[] arr)
	{

		int currMaxDiff = -1;
		int currMax = arr[arr.length - 1];
		for (int i = arr.length - 2; i >= 0; --i)
		{
			if (arr[i] < currMax)
			{
				int diff = currMax - arr[i];
				if (currMaxDiff < diff)
				{
					currMaxDiff = diff;
				}
			}
			else
			{
				currMax = arr[i];
			}
		}
		return currMaxDiff;
	}
	
	
}
