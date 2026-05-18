/*1295. Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1: Input: nums = [12,345,2,6,7896] Output: 2 */

class CountEven29
{
	public static void main(String x[])
	{
		int [] nums = {1,2,3,4,5,6};
		System.out.println(countEvenOdd(nums));
	}
	public static int countEvenOdd(int[] nums)
	{
		int count = 0, evenCount=0 ;
		for(int i = 0 ; i < nums.length ; i++)
		{
			int temp = nums[i]; 
			while(temp != 0)
			{
				count++; 
				temp /= 10; 
			}
			if(count%2 == 0)
			{
				evenCount++;
			}
			count=0;
		}
		return evenCount;
	}
}