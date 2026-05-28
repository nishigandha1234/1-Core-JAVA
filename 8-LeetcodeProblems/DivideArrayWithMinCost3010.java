/*3010. Divide an Array Into Subarrays With Minimum Cost I
You are given an array of integers nums of length n.The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.You need to divide nums into 3 disjoint contiguous subarrays.Return the minimum possible sum of the cost of these subarrays.
Example 1:Input: nums = [1,2,3,12] Output: 6*/

class DivideArrayWithMinCost3010
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,12};
		System.out.println(minimumCost(nums));
	}
	public static int minimumCost(int[] nums) 
	{
        int min = Integer.MAX_VALUE;
		
		for(int i = 1 ; i < nums.length ; i++)
		{
			for(int j = i+1 ; j < nums.length ; j++)
			{
				int firstCost = nums[0];
				int second = nums[i];
				int third = nums[j];
				
				int sum = firstCost + second + third;
				if(sum < min)
					min = sum;
			}
		}
		return min; 
    }
}