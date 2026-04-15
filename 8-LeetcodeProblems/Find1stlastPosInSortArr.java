//34. Find First and Last Position of Element in Sorted Array
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.If target is not found in the array, return [-1, -1].You must write an algorithm with O(log n) runtime complexity.
import java.util.*;
class Find1stlastPosInSortArr
{
	public static void main(String x[])
	{
		int[] nums = {1};
		int	target = 1;
		System.out.println(Arrays.toString(searchRange(nums,target)));
	}
	public static int[] searchRange(int[] nums, int target) 
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			for(int j =i+1; j < nums.length ; j++)
			{
				if(nums[i] == target && nums[j] == target)
				{
					return new int[]{i, j};
				}
			}
		}
		if(nums.length == 1)
		{
			return new int[]{0,0};
			ret
		}
		return new int[]{-1,-1};
    }
}