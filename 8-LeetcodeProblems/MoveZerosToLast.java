//283. Move Zeroes
//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.Note that you must do this in-place without making a copy of the array.

class MoveZerosToLast
{
	public static void main(String x[])
	{
		int[] nums = {0,1,0,3,12};
		moveZeroes(nums);
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i] + " ");
        }
	}
	public static void moveZeroes(int[] nums) 
	{
        int index = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[index++] = nums[i];
            }
        }

        while(index < nums.length)
        {
            nums[index] = 0;
            index++;   // missing line
        }
    }
}