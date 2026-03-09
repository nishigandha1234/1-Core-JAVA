import java.util.Scanner;

class MissingElement
{
	public static void main(String x[])
	{
		Scanner sc = new Sacnner(System.in);
		System.out.println("Enter Values in an Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}			
		
	}
}