/*30 Copy array elements*/

class CopyArrayElements30
{
	public static void main(String x[])
	{
		int[] nums  = {10,20,30,40,50};
		copyArray(nums);
	}
	public static void copyArray(int[] nums)
	{
		int[] ans = new int[nums.length];
		
		for(int i = 0 ; i < nums.length ; i++)
		{
			ans[i] = nums[i];
		}
		for(int i = 0 ; i < nums.length ; i++)
		{
			System.out.print(ans[i] +" ");
		}
	}
}