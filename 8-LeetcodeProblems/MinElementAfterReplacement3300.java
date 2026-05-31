/*3300. Minimum Element After Replacement With Digit Sum
You are given an integer array nums.You replace each element in nums with the sum of its digits.Return the minimum element in nums after all replacements.
Example 1:Input: nums = [10,12,13,14] Output: 1*/

class MinElementAfterReplacement3300
{
	public static void main(String x[])
	{
		int[] nums = {999,19,199};
		System.out.println(minElement(nums));
		//minElement(nums);
	}
	public static int minElement(int[] nums) 
	{
		int[] ans = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++)
		{
			int num = nums[i]; //10
			int temp = num; 
			int sum = 0;
			while(temp != 0) //10
			{
				int rem = temp % 10;
				sum += rem; 
				temp /= 10;
			}
			ans[i] = sum;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < ans.length ; i++)
		{
			min = Math.min(ans[i], min);
		}
		return min;
    }
}