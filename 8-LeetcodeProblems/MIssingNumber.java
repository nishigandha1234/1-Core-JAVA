//268. Missing Number
//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

import java.util.Scanner;
class MissingNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int n = sc.nextInt();
		
		int[] nums = new int[n];
		
		System.out.println("Enter " + n + " values:");
		for(int i = 0 ; i < n ; i++)
		{
			nums[i] = sc.nextInt();
		}
		int ans = missingNumber(nums);
		System.out.println(ans);
	}
	public static int missingNumber(int[] nums)  //[0,1,3]
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