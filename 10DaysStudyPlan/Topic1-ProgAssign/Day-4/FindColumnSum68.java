/*68 Find column sum — */

class FindColumnSum68
{
	public static void main(String x[])
	{
		int[][] ar = {
					{1,3,6},	
					{2,0,3},
					{3,4,2}
					};
		
		for(int i = 0 ; i < ar[0].length ; i++)
		{
			int sum = 0 ;
		
			for(int j = 0 ; j < ar.length ; j++)
			{
				sum += ar[j][i];
			}
			System.out.println("Sum : "+sum);
		}
	}
}