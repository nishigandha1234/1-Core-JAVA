import java.util.Scanner;
class Shift90Degree
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[3][3];
		int[][]ans = new int[3][3];
		int m = ar.length-1;
		
		for(int i=0; i < ar.length; i++) //row 
		{  
			for(int j=0; j < ar[i].length; j++) //column 
			{     
				ar[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[i].length ; j++)
			{
				ans[j][m] = ar[i][j];
			}
			m--;
		}
		
		System.out.println("Display matrix");
		for(int i=0; i<ans.length; i++) //row 
		{  
				for(int j=0; j<ans[i].length; j++) //column 
				{     
					System.out.printf("%d\t",ans[i][j]);
				}
				System.out.println();
		}

	}
}