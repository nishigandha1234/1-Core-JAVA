import java.util.Scanner;

class ReverseArrayInSame
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		int k = a.length-1;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			int temp = a[i];
			for(int j = 0 ; j < a.length-i ; j ++)
			{
				a[i] = a[i+1];
			}
			
		}
		
	}
}