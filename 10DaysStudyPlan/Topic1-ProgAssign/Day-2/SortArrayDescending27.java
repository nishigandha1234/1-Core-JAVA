/*27 Sort descending order*/

import java.util.*;
class SortArrayDescending27
{
	public static void main(String x[])
	{
		int[] nums = {4000,3000,1000,2000};
		sortArraydesc(nums);
	}
	public static void sortArraydesc(int[] nums) 
    {
        Arrays.sort(nums);
		
		for(int i = nums.length-1 ; i >= 0 ; i--)
		{
			System.out.print(nums[i] + " ");
		}
    }
}

