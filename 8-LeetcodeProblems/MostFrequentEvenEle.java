//2404. Most Frequent Even Element

//Given an integer array nums, return the most frequent even element.If there is a tie, return the smallest one. If there is no such element, return -1.

class MostFrequentEvenEle
{
	public static void main(String x[])
	{
		int nums[] = {0,1,2,2,4,4,1};
		System.out.println(mostFrequentEven(nums));
	}
	public static int mostFrequentEven(int[] nums) 
	{
		int count = 0, maxCount = 0, ans = -1;
		for(int i = 0 ; i< nums.length ; i++)
		{
			for(int j = i+1 ; j < nums.length-1 ; j++)
			{
				if((nums[i] == nums[j]) && (nums[i]%2 == 0))
				{
					count++;
				}
			}
			if(count>maxCount)
			{
				maxCount = count;
				ans = nums[i];
			}
		}
        return ans;
    }
}