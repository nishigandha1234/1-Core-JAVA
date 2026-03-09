import java.util.Scanner;

class MajorityElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int a[] = new int[5];
		for(int i =0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
	}
}