/*102 Rotate array Left LC 189
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1: Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4]*/

class RotateArray101
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,4,5,6,7};
		int	k = 3;
		rotate(nums, k);
	}
	public static void rotate(int[] nums, int k)
	{
		while(k != 0)
		{
			for(int i = nums.length-1 ; i > 0 ; i--)
			{
				int temp = nums[i];
				nums[i] = nums[i-1];
				nums[i-1] = temp;
			}
			k--;
		}
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(nums[i]+" ");
		}
	}
}