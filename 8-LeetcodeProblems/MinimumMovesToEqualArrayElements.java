/*453. Minimum Moves to Equal Array Elements
Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment n - 1 elements of the array by 1
Example 1: Input: nums = [1,2,3] Output: 3 */

class MinimumMovesToEqualArrayElements
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3};
		System.out.println(minMoves(nums));
	}
	public static int minMoves(int[] nums) 
	{
        int min = Integer.MAX_VALUE;
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(nums[i] < min)
			{
				min = nums[i];
			}
		}
		
		int moves = 0 ;
		for(int i = 0 ; i < nums.length ; i++)
		{
			moves += nums[i]-min;
		}
		return moves;
    }
}