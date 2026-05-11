/*2553. Separate the Digits in an Array
Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.To separate the digits of an integer is to get all the digits it has in the same order.For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
Example 1: Input: nums = [13,25,83,77] Output: [1,3,2,5,8,3,7,7]*/

class SeparateDigitsInArray
{	
	public static void main(String x[])
	{
		int[] nums = {13,25,83,77};
		System.out.println(separateDigits(nums));
	}
	public static int[] separateDigits(int[] nums) 
	{
		int[] ans = new int[nums.length*2];
		
        for(int i = 0 ; i < nums.length ; i++)
		{
			int temp = nums[i];
			int rem = temp % 10;
			ans[i] = rem;
			temp/=10;
		}
		return ans;
    }
}