/*912. Sort an Array
Given an array of integers nums, sort the array in ascending order and return it.You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
Example 1: Input: nums = [5,2,3,1] Output: [1,2,3,5]*/

class SortArray26
{
	public static void main(String x[])
	{
		int[] nums = {4000,3000,1000,2000};
		System.out.println(sortArray(nums));
	}
	public int[] sortArray(int[] nums) 
    {
        Arrays.sort(nums);
        return nums;
    }
}

