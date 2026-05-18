/*704. Binary Search
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1. You must write an algorithm with O(log n) runtime complexity.
Example 1: Input: nums = [-1,0,3,5,9,12], target = 9 Output: 4*/

class BinarySearch28
{
	public static void main(String x[])
	{
		int[] nums = {-1,0,3,5,9,12};
		int	target = 9 ;
		System.out.println(search(nums,target));
	}
	public static int search(int[] nums, int target) 
	{
        int i = 0 , j = nums.length-1;
		int index = -1;
		while(i <= j)
		{
			int mid = (i+j)/2;
			if(nums[mid] == target)
			{
				index = mid;
				break;
			}
			else if(nums[mid] < target)
			{
				i = mid+1;
			}
			else
			{
				j = mid-1;
			}
		}
		return index;
    }
}