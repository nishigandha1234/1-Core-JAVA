import java.util.Scanner;

class RotateArrayByNpositions
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[11];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter Value of Rotations N : ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i < n ; i++)
		{
			int temp = a[0];
			for(int j = 0 ; j < a.length-1; j++)
			{
				a[j] = a[j+1];
			}
			a[a.length-1] = temp;
		}
		
		System.out.println("After Rotation Array : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	
	}
}