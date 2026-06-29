/*3550. Smallest Index With Digit Sum Equal to Index
You are given an integer array nums.Return the smallest index i such that the sum of the digits of nums[i] is equal to i.If no such index exists, return -1.
Example 1:Input: nums = [1,3,2] Output: 2 */

class SmallestIndex3550
{
	public static void main(String x[])
	{
		int[] nums
		int[] nums = {1,3,2};
		System.out.println(smallestIndex(nums));
	}
	public static int smallestIndex(int[] nums) 
	{
        for(int i = 0 ; i < nums.length ; i++)
		{
			int temp = nums[i];
			int sum  = 0;
			while(temp != 0)
			{
				int rem = temp % 10;
				sum += rem;
				temp /= 10;
			}
			if(sum == i)
			{
				return i;
			}
		}
		return -1;
    }
}