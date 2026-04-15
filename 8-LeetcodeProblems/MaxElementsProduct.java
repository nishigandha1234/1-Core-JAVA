//1464. Maximum Product of Two Elements in an Array
//Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
import java.util.*;
class MaxElementsProduct
{
	public static void main(String x[])
	{
		int[] nums = {10,2,5,2};
		System.out.println(maxProduct(nums));
	}
	public static int maxProduct(int[] nums) 
	{
        int max = Math.max(nums[0], nums[1]);
        int secMax = Math.min(nums[0], nums[1]);
		//System.out.println(max);
		//System.out.println(secMax);
        for(int i = 2; i < nums.length; i++)
        {
            if(nums[i] >= max)
            {
                secMax = max;
                max = nums[i];
            }
            else if(nums[i] > secMax)
            {
                secMax = nums[i];
            }
        }
        return (max - 1) * (secMax - 1);
    }
}
