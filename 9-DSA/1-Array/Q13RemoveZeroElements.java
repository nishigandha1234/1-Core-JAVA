import java.util.Scanner;

class Q13RemoveZeroElements
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Elements in Array : ");
		int a[] = new int[7];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int k = 0;
		int ans[] = new int[a.length];
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != 0)
			{
				ans[k++] = a[i];
			}
		}
		System.out.println("After Removing Zeros : ");
		for(int i = 0 ; i < k ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}