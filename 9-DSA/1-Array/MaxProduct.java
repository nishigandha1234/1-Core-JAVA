/*Write a Java program to find the maximum product of a contiguous subarray. 
Input: Enter size: 6 Enter elements: 2 3 -2 4 -1 5 
Output: Maximum product is: 240*/

class MaxProduct
{
	public static void main(String x[])
	{
		int[] arr = {2,3,-2,4,-1,5};
		int n = arr.length;
		int max = arr[0];
		for(int i = 0 ; i < n ; i++)
		{
			int product = 1;
			for(int j = i ; j < n ; j++)
			{
				product *= arr[j];
				if(product > max)
					max = product;
			}
		}
		System.out.println(max);
	}
}