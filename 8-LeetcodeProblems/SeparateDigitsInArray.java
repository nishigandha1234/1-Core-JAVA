/*2553. Separate the Digits in an Array
Given an array of positive integers nums, return an array answer that consists of the digits of each integer in nums after separating them in the same order they appear in nums.To separate the digits of an integer is to get all the digits it has in the same order.For example, for the integer 10921, the separation of its digits is [1,0,9,2,1].
Example 1: Input: nums = [13,25,83,77] Output: [1,3,2,5,8,3,7,7]*/
import java.util.*;	
class SeparateDigitsInArray
{	
	public static void main(String x[])
	{
		int[] nums = {13,25,83,77};
		System.out.println(Arrays.toString(separateDigits(nums)));
	}
	public static int[] separateDigits(int[] nums) 
	{
		int count = 0;
		
		for(int i =0 ; i < nums.length ; i++)
		{
			int temp = nums[i];
			while(temp > 0)
			{
				count++;
				temp/=10;
			}
		}
		
		int[] ans = new int[count];
		int k = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			int temp = nums[i];
			int div = 1;
			
			while(temp/div >= 10)
			{
				div *= 10;
			}
			
			while(div > 0)
			{
				ans[k++] = temp/div;
				temp = temp % div;
				div/=10;
			}
		}
		return ans;
	}
}