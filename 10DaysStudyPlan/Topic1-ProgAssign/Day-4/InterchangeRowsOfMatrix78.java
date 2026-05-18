/*78 Interchange rows of matrix — 
[1, 2, 3]  	    [7, 8, 9]
[4, 5, 6]   =>	[4, 5, 6]
[7, 8, 9]	    [1, 2, 3]*/

class InterchangeRowsOfMatrix78
{
	public static void main(String x[])
	{
		int[][] a = {{1,2,3},{4, 5, 6},{7,8,9}};
		System.out.println("Original Matrix");
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[0].length ; j++)
			{
				System.out.print(a[i][j] +" ");
			}	
			System.out.println();
		}	
		
		int n = a.length-1;
		
		for(int j = 0 ; j < a[0].length ; j++)
		{
			int temp = a[0][j];
			a[0][j] = a[n][j];
			a[n][j] = temp;
		}	
			
		System.out.println("New Matrix");
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < a[0].length ; j++)
			{
				System.out.print(a[i][j] +" ");
			}	
			System.out.println();
		}	
	}
}