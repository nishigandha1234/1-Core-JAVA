/*36 Count frequency of array elements 
1207. Unique Number of Occurrences
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.
Example 1: Input: arr = [1,2,2,1,1,3] Output: true*/

class UniqueCountFrequencyOfArray36
{
	public static void main(String x[])
	{
		int[] arr = {1,2};
		System.out.println(uniqueOccurrences(arr));
	}
	public static boolean uniqueOccurrences(int[] arr) 
	{
        int[] freq = new int[2001];
		
		for(int i = 0 ; i < arr.length ; i++)
		{
			freq[arr[i]+1000]++;
		}
		for(int i = 0 ; i < freq.length ; i++)
		{
			for(int j = i+1 ; j < freq.length ;j++)
			{
				if(freq[i] > 0 && freq[i] == freq[j])
					return false;
			}
		}
		return true;	
    }
} 