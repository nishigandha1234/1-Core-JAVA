//2413. Smallest Even Multiple
//Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.

class SmallestEvenMultiple
{
	public static void main(String x[])
	{
		System.out.println(smallestEvenMultiple(6));
	}
	public static int smallestEvenMultiple(int n) 
	{
		for(int i = 2 ; i < n ; i++)
		{
			if(n%i == 0 && i%2 == 0)
				return i;
		}
    }
}