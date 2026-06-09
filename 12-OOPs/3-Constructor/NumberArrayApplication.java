/*Description: Create NumberArray class having an integer array. Initialize array using constructor. Find maximum number using logic.
INPUT: Enter 5 numbers: 10 45 22 89 34 
OUTPUT: Maximum number is: 89*/

import java.util.Scanner;
class NumberArray
{
	private int[] arr;

	NumberArray(int[] arr)
	{
		this.arr = arr;
	}
	public int getMax()
	{
		int max = Integer.MIN_VALUE;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
}
public class NumberArrayApplication 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter Values in Array : ");
		for(int i = 0 ; i < nums.length ; i++)
		{
			nums[i] = sc.nextInt();
		}
		NumberArray num = new NumberArray(nums);
        System.out.println("Maximum number is: " + num.getMax());
	}
}