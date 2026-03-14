import java.util.Scanner;

class Q29RearrangeEvenOdd
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Elements in Array : ");
		int a[] = new int[6];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int even[] = new int[3];
		int odd[] = new int[3];
		int ans[] = new int[a.length];
		for(int i = 0, j = 0 ; i < a.length ; i++)
		{
			if(a[i]%2==0)
			{
				even[j++] = a[i];
			}	
		}
		for(int i = 0, j = 0 ; i < a.length ; i++)
		{
			if(a[i]%2!=0)
			{
				odd[j++] = a[i];
			}	
		}
		int k = 0;
		for(int i = 0 ; i < even.length ; i++)
		{
			ans[k++] = even[i];
			ans[k++] = odd[i];
		}
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i] + " ");
		}
	}
}