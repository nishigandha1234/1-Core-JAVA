import java.util.Scanner;

class MoveZerosToLast
{
	public static void main(String x[])
	{
		System.out.println(moveZeroes([0,1,0,3,12]);
	}
	 public static void moveZeroes(int[] nums) {
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