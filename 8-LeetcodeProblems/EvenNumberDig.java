//1295. Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.

import java.util.*;

class EvenNumberDig
{
	public static void main(String x[])
	{
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumbers(nums));
	}
	public static int findNumbers(int[] nums) 
	{
		int count = 0, evenCount=0 ;
		for(int i = 0 ; i < nums.length ; i++)
		{
			int temp = nums[i]; 
			while(temp != 0) //1!=0
			{
				count++; //1
				temp /= 10; //1
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