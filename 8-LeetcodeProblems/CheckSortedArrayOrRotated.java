//1752. Check if Array Is Sorted and Rotated
//Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false. There may be duplicates in the original array. Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

class CheckSortedArrayOrRotated
{
	public static void main(String x[])
	{
		int[] nums = {3,4,5,1,2};
		System.out.println(check(nums));
	}
	public static boolean check(int[] nums) 
	{
		int n = nums.length;
		int count = 0 ;
		
        for(int i = 0 ; i < nums.length-1 ; i++)
		{
			if(nums[i] > nums[(i+1)%n])
			{
				count++;
			}
		}
		if(count <= 1 )
		{
			return true;
		}
		return false;			
    }
}