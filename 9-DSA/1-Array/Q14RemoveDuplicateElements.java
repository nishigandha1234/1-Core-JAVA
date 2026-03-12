import java.util.Scanner;

class Q14RemoveDuplicateElements
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
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = i+1 ; j < a.length-1 ; j++)
			{
				if(a[i] != a[j])
				{
					ans[k++] = a[i];
				}
			}
		}
		System.out.println("After Removing Duplicate Elements : ");
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}