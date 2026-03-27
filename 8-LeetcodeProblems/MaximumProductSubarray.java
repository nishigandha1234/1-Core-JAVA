//152. Maximum Product Subarray
//Given an integer array nums, find a subarray that has the largest product, and return the product.The test cases are generated so that the answer will fit in a 32-bit integer.Note that the product of an array with a single element is the value of that element.

class MaximumProductSubarray
{
	public static void main(String[] x)
	{
		int[] nums = {-2,0,-1};
		int result = maxProduct(nums);
		System.out.println(result);
	}
	public static int maxProduct(int[] nums) 
	{
		int product = 1, max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			product *= nums[i];
			if(product > max )
				max = product;
			if(product == 0)
				pro
				product=1;
		}
		product = 1;
		for(int i = nums.length-1 ; i >= 0 ; i--)
		{
			product*= nums[i];
			if(product > max)
				max = product;
			if(product == 0) 
				product =1 ;
		}
		return max;
    }
}