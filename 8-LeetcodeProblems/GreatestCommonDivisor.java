//1979. Find Greatest Common Divisor of Array
//Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.

class GreatestCommonDivisor
{
	public static void main(String x[])
	{
		int[] nums = {2,5,6,9,10};
		int result = findGCD(nums);
		System.out.println(result);
	}
	public static int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for(int i = 0, j = 1 ; i < nums.length ; i++)
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
            if(nums[i] < min)
            {
                min = nums[i];
            }
        }
        int gcd = 1 ; 
        for(int i = 1 ; i <= min ; i++)
        {
            if(max % i == 0 && min%i==0)
            {
                gcd = i;
            }
        }
        return gcd;
       
    }
}