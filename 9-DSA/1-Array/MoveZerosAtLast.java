import java.util.Scanner;

class MoveZerosAtLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int[] a = new int[5]; //10,0,20,0,5
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int[] ans = new int[a.length];
		int k = 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != 0)
			{
				ans[k++] = a[i];
			}
		}
		for(int i = k ; i < ans.length ; i++)
		{
			ans[k++] = 0;
		}
		
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}
}