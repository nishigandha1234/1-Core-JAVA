import java.util.Scanner;

class Q35SquareOfElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Array : ");
		int size = sc.nextInt();
		System.out.println("Enter the Values : ");
		int a[] = new int[size];
		for(int i= 0 ; i< a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i< a.length ; i++)
		{
			a[i] = a[i]*a[i];
		}
		System.out.println("New Array : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}