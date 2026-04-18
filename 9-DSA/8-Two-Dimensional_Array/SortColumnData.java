import java.util.Scanner;

class SortColumnData
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[][] = new int[3][3];
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[i].length ; j++)
			{
				a[i][j] = sc.nextInt();			
			}
		}
		
		//swapp
		for(int i = 0 ; i < a[0].length ; i++)
		{
			for(int j = 0 ; j < a.length-1; j++)
			{
				for(int k = 0 ; k < a.length-j-1; k++)
				{
					if(a[k][i] > a[k+1][i])
					{
						int temp = a[k][i];
						a[k][i] = a[k+1][i];
						a[k+1][i] = temp;
					}
				}
			}
		}
		//display matrix
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[i].length ; j++)
			{
				System.out.print(a[i][j]+" ");			
			}
			System.out.print
			System.out.println();
		}
	}
}