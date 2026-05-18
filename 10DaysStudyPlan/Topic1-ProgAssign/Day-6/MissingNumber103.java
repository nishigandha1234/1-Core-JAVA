/*103 Find missing number LC 268 */
//to find single element
class MissingNumber103
{
	public static void main(String x[])
	{
		int[] nums = {3,0,1};
		System.out.println(missingNumber(nums));
	}
	public static int missingNumber(int[] nums)
	{
		int n = nums.length; //3
		int actSum= 0;
		int expSum = (n*(n+1))/2;
		for(int i = 0 ; i < n ; i++)
		{
			actSum += nums[i];
		}
		return expSum - actSum;
	}
}