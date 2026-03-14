import java.util.Scanner;

class Q31AddZeroTo1stLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[6];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			a[0] = 0;
			a[a.length-1] = 0;
		}
		System.out.print("New Array is : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}