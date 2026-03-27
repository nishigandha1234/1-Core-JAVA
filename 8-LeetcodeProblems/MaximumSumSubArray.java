//53. Maximum Subarray
//Given an integer array nums, find the subarray with the largest sum, and return its sum.
  
public class MaximumSumSubArray
{
    public static void main(String x[])
	{ 
	   int nums[]=new int[]{1,2,3,2,1};
	   int result = maxSubArray(nums);
	   System.out.println(result);
	}
    public static int maxSubArray(int[] nums) 
    {
		int sum = nums[0];
        int max = nums[0];

       for(int i = 1; i < nums.length; i++)
       {
			if(sum + nums[i] > nums[i])
				sum = sum + nums[i];
			else
				sum = nums[i];
			
			if(sum > max)
              max = sum;
       }
       return max;
    }

}
