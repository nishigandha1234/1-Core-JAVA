/*46 Function to find GCD 
1979. Find Greatest Common Divisor of Array
Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums. The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
Example 1: Input: nums = [2,5,6,9,10] Output: 2
"The smallest number in nums is 2.The largest num is 10.The greatest common divisor of 2 and 10 is 2"*/

class FunctionFindGCD46
{
	public static void main(String x[])
	{
		int[] nums = {3,4,5,6,7,8};
		System.out.println(findGCD(nums));
	}
	public static int findGCD(int[] nums)
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		int gcd = 1;
		for(int i = 1 ; i<=min ;i++)
		{
			if(max%i == 0 && min%i == 0)
			{
				gcd = i;
			}
		}
		return gcd;
	}
}