//922. Sort Array By Parity II
//Given an array of integers nums, half of the integers in nums are odd, and the other half are even.Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

import java.util.*;
class EvenEleATEven
{
	public static void main(String x[])
	{
		int nums[] = {4,8,5,7,10,11};

		int result[] = sortArrayByParityII(nums);

		System.out.println(Arrays.toString(result));
	}
	public static int[] sortArrayByParityII(int[] nums) 
	{
        int even = 0 , odd = 1;
		while(even < nums.length && odd < nums.length)
		{
			if(nums[even] % 2 == 0)
			{
				even+=2;
			}
			else if(nums[odd] % 2 != 0)
			{
				odd+=2;
			}
			else
			{
				int temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
			}
		}
		return nums;
    }
}