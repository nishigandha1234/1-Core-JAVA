import java.util.Scanner;

class RotateArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		int[] ans = new int[a.length];
		int k = a.length;
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			ans[i] = a[k]; 
			k--;
		}
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}
}