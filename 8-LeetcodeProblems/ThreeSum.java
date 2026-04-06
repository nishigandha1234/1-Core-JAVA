//15. 3Sum
//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k and nums[i]+nums[j]+nums[k]==0. Notice that the solution set must not contain duplicate triplets.

class ThreeSum
{
	public static void main(String x[])
	{
		int[] nums = {-1,0,1,2,-1,-4};
		int[] result = threeSum(nums);

    for(int i = 0; i < result.length; i++)
    {
        System.out.print(result[i] + " ");
    }
	}
	public static int[] threeSum(int[] nums)
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = i+1 ; j < nums.length ; j++)
			{
				for(int k = j+1 ; k < nums.length ; k++)
				{
					if( (i != j) && (j != k) && (i != k) && ((nums[i]+nums[j]+nums[k])==0) )
					{
						return new int[]{nums[i], nums[j], nums[k]};
					}
				}
			}
		}
		return new int[]{}; // if no triplet found
		return new int[]{}; //
	}
}