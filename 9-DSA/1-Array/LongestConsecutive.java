/* Q1. Write a Java program to find the length of the longest consecutive elements sequence in an 
unsorted integer array without using collections. 
Input:  Enter size: 10  Enter elements: 100 4 200 1 3 2 2 5 6 7  
Output: Longest consecutive sequence length is: 7 */

class LongestConsecutive
{
	public static void main(String x[])
	{
		int[] arr= {100, 4, 200, 1, 3, 2, 2, 5, 6, 7};
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++)
		{
			for(int j = 0 ; j < n-1-i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		int max = 1, count = 1;
		
		for(int i = 1 ; i < arr.length ; i++)
		{
			if(arr[i] == arr[i-1])
				continue;
			else if(arr[i]==arr[i-1]+1)
				count++;
			else
			{
				if(count > max)
					max = count;
				count = 1;
			}
		}
		if(count > max)
			max = count;
		System.out.println(max);
	}
}