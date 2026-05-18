/*23 Find sum of elements */

import java.util.*;

class SumOfElements23
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
		System.out.println(sum(nums));
	}
	public static int sum(int[] nums)
	{
		int sum = 0;
		for(int i = 0 ; i < nums.length ; i++)
		{
			sum += nums[i];
		}
		return sum;
	}
}