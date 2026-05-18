/*80 Count even and odd numbers in matrix*/

class CountEvenOddMatrix80
{
	public static void main(String x[])
	{
		int[][]ar = {
					{1,2,3},	
					{4,5,6},
					{7,8,9}
					};
		countEvenOdd(ar);
	}
	public static void countEvenOdd(int[][] ar)
	{
		int countEven= 0, countOdd = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			for(int j = 0 ; j < ar[0].length ; j++)
			{
				if(ar[i][j]%2 == 0)
				{
					countEven++;
				}
				else
				{
					countOdd++;
				}
			}
		}
		System.out.println("Odd Count : " +countOdd);
		System.out.println("Even Count : " +countEven);
	}
}