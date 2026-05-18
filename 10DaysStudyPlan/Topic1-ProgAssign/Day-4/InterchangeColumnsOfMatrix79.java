/*79 Interchange columns of matrix — */
/*[1, 2, 3]  	    [3, 2, 1]
  [4, 5, 6]   =>	[6, 5, 4]
  [7, 8, 9]	        [9, 8, 7]*/

class InterchangeColumnsOfMatrix79
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
		
		for(int j = 0 ; j < a.length ; j++)
		{
			int temp = a[j][0];
			a[j][0] = a[j][n];
			a[j][n] = temp;
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