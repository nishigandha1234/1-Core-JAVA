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
		if(n % 2 == 0)
			return n;
		else
			return n * 2;
		
		
    }
}