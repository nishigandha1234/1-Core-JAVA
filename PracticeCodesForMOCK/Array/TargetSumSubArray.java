//sum of target sum of sub array

class TargetSumSubArray
{
	public static void main(String x[])
	{
		int[] ar = {1,2,3,2,1};
		int count = 0 , k = 2 , target = 3, j;
		for(int i =0 ; i < (ar.length-k) ; i++)
		{
			int sum = 0;
			
			for( j = i ; j < (i+k); j++)
			{
				sum += ar[j];
			}
			System.out.printf("{ %d, %d} = %d \n",ar[i],ar[j-1],sum);

			if(sum == target)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}