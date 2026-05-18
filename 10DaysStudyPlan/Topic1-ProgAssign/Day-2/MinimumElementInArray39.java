/*39 Find smallest element */

import java.util.*;
class MinimumElementInArray39
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array : ");
		int[] nums = new int[5];
		for(int i = 0 ; i < nums.length ; i++)
		{
			nums[i] = sc.nextInt();
		}
		System.out.println(min(nums));
	}
	public static int min(int[] nums)
	{
		int min = nums[0];
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		return min;
	}
}

