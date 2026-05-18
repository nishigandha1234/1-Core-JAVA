/*38. swap alternate elements*/
import java.util.*;
class SwapAlternateElements38
{	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements in array : ");
		int[] nums = new int[5];
		for(int i = 0 ; i < nums.length ; i++)
		{
			nums[i] = sc.nextInt();
		}
		int[] ans = swap(nums);
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	//1 2 3 4 5
	public static int[] swap(int[] nums)
	{	
		for(int i = 0 ; i < nums.length-1 ; i+=2 )
		{
			int temp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = temp;
		}
		return nums;
	}
}