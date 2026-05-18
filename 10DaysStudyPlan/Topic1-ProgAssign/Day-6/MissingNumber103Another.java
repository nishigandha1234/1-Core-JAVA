/*103 Find missing number LC 268 */
//to find multiple element
import java.util.*;
class MissingNumber103Another
{
	public static void main(String x[])
	{
		int[] nums = {3,0,1,5,6};
		missingNumber(nums);
	}
	public static void missingNumber(int[] nums)
	{
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length-1 ; i++)
		{
			int diff = nums[i+1] - nums[i];
			
			if(diff > 1)
			{
				System.out.print("Missing Numbers are : ");
				for(int j = 1 ; j < diff ; j++)
				{
					System.out.print(nums[i]+j +" ");
				}
			}
		}
	}
}