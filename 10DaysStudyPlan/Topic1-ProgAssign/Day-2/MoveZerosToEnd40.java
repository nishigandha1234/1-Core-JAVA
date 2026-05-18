/*40 Move zeros to end */

import java.util.*;
class MoveZerosToEnd40
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
		System.out.println(Arrays.toString(moveZeros(nums)));
	}
	public static int[] moveZeros(int[] nums)
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = 0 ; j < nums.length -1 ; j++)
			{
				if(nums[j] == 0)
				{
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		return nums; 
	}
}