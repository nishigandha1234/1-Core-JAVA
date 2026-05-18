/*21. Find maximum element */

import java.util.*;
class MaximumElementInArray21
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
		System.out.println(max(nums));
	}
	public static int max(int[] nums)
	{
		int max = nums[0];
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] > max)
			{
				max = nums[i];
			}
		}
		return max;
	}
}

