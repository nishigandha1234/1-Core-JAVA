//169. Majority Element
//Given an array nums of size n, return the majority element.The majority element is the element that appears more than [n / 2] times. You may assume that the majority element always exists in the array.

class MajorityElements
{
	public static void main(String x[])
	{
		int nums[] = {4, 8, 4, 6, 7, 4, 4, 8};
		majorityElement(nums);
	}
	public static int majorityElement(int[] nums) 
    {
        int majority = -1;
		
		for(int i = 0 ; i < nums.length-1 ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < nums.length ; j++)
			{
				if(nums[i] == nums[j])
				{
					count++;
				}
			}
			if(count > nums.length/2)
			{
				majority = nums[i];
				break;
			}
		}
		return majority;
    }
}