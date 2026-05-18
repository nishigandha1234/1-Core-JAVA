/*32 Find second largest element */

class SecondMax
{
	public static void main(String x[])
	{
		int[] nums = {10,20,30,40};
		System.out.println(secondMax(nums));
	}
	public static int secondMax(int[] nums)
	{
		int max = nums[0], secMax = nums[0];
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] > max)
			{
				secMax = max;
				max = nums[i];
			}
			else if(nums[i] > secMax && nums[i] != max)
			{
				secMax = nums[i];
			}
		}
		return secMax;
	}
}