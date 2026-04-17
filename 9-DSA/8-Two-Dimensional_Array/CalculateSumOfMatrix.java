import java.util.Scanner;

class CalculateSumOfMatrix
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[][] = new int[3][3];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[i].length ;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		//Sum logic
		int sum = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[i].length ;j++)
			{
				sum += a[i][j];
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" = " +sum+" ");
		}
	}
}