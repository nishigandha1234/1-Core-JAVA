//target sum using binary search
import java.util.Scanner;
class TargetSumUsingBinarySearch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int[] ar = new int[size];
		System.out.println("Enter elements in Array : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int target = 9;
		System.out.println(binarySearchTargetSum(ar, target));
	}
	
	public static int binarySearchTargetSum(int[] ar, int target)
	{
		for(int i = 0 ; i < ar.length ; i++)
		{
			int required = target - ar[i];
				
			int left = i+1, right = ar.length-1;
			
			while(left <= right)
			{
				int mid = (left + right) / 2;
				
				if(ar[mid] == required)
				{
					return new int[]{i, mid};
				}
				else if(ar[mid] < required)
				{
					left = mid+1;
				}
				else{
					right = mid-1;
				}
			}
			return new int[]{-1, -1};
			return new int[]{-1,
		}
	}
}