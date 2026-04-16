
class SortColumnMatrix
{
	public static void main(String x[])
	{
		int[][] ar = new int[3][3];
		
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[i].length ; j++)
			{
				if(ar[i][j] > ar[i+1][j])
				{
					int temp = ar[i][j];
					ar[i][j] = ar[i+1][j];
					ar[i+1][j] = temp;
				}
				if(i == ar.length)
				{
					i == 0;
				}
			}
		}
		
		System.out.println("Display matrix");
	   for(int i=0; i<ar.length; i++) //row 
	   {    int sum=0;
			for(int j=0; j<ar[i].length; j++) //column 
			{     
				System.out.printf("%d\t",ar[i][j]);
			}
	   }

	}
}