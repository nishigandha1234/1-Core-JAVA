/*34 Print even index elements */

class PrintEvenIndexElements34
{
	public static void main(String x[])
	{
		int[] nums = {10,20,30,40,50};
		evenIndex(nums);
	}
	public static void evenIndex(int[] nums)
	{
		for(int i = 0 ; i < nums.length ; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i+" = "+nums[i]);
			}
		}
	}
}