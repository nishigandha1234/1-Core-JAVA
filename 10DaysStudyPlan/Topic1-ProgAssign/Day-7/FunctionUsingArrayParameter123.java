/*123 Function using array parameter — */

class FunctionUsingArrayParameter123
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,4,5};
		System.out.println(sumArray(nums));
	}
	public static int sumArray(int[] nums)
	{
		int sum = 0 ;
		for(int i = 0 ; i < nums.length ; i++)
		{
			sum += nums[i];
		}
		return sum;
	}
}