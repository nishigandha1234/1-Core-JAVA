import java.util.Scanner;

class ReverseArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[] = new int[8] ; 
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = a.length-1 ; i>=0 ;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}