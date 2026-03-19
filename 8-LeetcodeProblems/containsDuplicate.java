//217. Contains Duplicate
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct

class containsDuplicate 
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
    public static boolean containsDuplicate(int[] nums) 
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j = i+1 ; j < nums.length ; j++)
			{
				if(nums[i] == nums[j])
				{
					return true;
				}
			}
		}
		return false;
    }
}