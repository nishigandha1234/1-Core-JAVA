 
public class MaximumSumSubArray
{
    public static void main(String x[])
	{ 
		int[] a= {1,2,3,2,1};
		int k = 2 , sum = 0 , max = Integer.MIN_VALUE ; 
		for(int i = 0 ; i < k ; i++)
		{
			sum += a[i];
		}
		if(sum > max)
			max = sum;
		for(int i = k ; i < a.length ; i++)
		{
			sum = sum + a[i] - a[i-k];
			if(sum > max)
				max = sum;
		}
		System.out.println(max);
    }
}
