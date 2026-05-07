/*3917. Count Indices With Opposite Parity
You are given an integer array nums of length n.The score of an index i is defined as the number of indices j such that: i < j < n, and nums[i] and nums[j] have different parity (one is even and the other is odd).Return an integer array answer of length n, where answer[i] is the score of index i.
Example 1: Input: nums = [1,2,3,4] Output: [2,1,1,0]*/
//int[]
class CountIndicesWithOppositeParity
{
	public static void main(String x[])
	{
		int[] nums = {1,2,3,4};
		System.out.println(countOppositeParity(nums));
		
	}
	public static int[] countOppositeParity(int[] nums) 
    {
        int[] ans = new int[nums.length];
		
        int even = 0;
        int odd = 0;

        for(int i = n - 1; i >= 0
        for(int i = n - 1; i >= 0; i--) 
		{

            if(nums[i] % 2 == 0) 
            {   
                ans[i] = odd;
                even++;
            } else {                
                ans[i] = even;
                odd++;
            }
        }
        return ans;
    }
}
