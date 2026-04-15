//3566. Partition Array into Two Equal Product Subsets
//You are given an integer array nums containing distinct positive integers and an integer target.Determine if you can partition nums into two non-empty disjoint subsets, with each element belonging to exactly one subset, such that the product of the elements in each subset is equal to target.Return true if such a partition exists and false otherwise.A subset of an array is a selection of elements of the array.

class PartitionArrayIntoTwoEquProd
{
	public static void main(String x[])
	{
		int[] nums = {3,1,6,8,4};
		int	target = 24;
		checkEqualPartitions(nums, target);
	}
	public static void checkEqualPartitions(int[] nums, long target) 
	{
		for(int i = 0 ; i < nums.length; i++)
		{
			for(int j = i+1 ; j < nums.length ; j++)
			{
				if(nums[i] * nums[j] == target)
				{
					int ans = i;
					int res = j;
					System.out.println(ans+" "+res);
				}
			}
		}
        
    }
}