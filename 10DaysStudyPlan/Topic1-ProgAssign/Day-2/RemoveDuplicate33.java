/*33 Remove duplicate elements */

class RemoveDuplicate33
{
	public static void main(String x[])
	{
		int[] nums = {10,10,20,20,20,30};
		System.out.println(removeDup(nums);
	}
	public static int removeDup(int[] nums)
	{
		int[] ans = new int[nums.length];
		int k = 0;
		for(int i = 1 ; i < nums.length ; i++)
		{
			if(nums[i] != nums[i-1])
			{
				ans[k++] = nums[i];
			}
		}
		int count = 0;
		for(int i = 0 ; i < k; i++)
		{
			count++;
		}
		return count;
	}
}