/*43 Function to check prime number
204. Count Primes Given an integer n, return the number of prime numbers that are strictly less than n.
Example 1: Input: n = 10 Output: 4*/

class CheckPrime43
{
	public static void main(String x[])
	{
		int n = 10;
		System.out.println(countPrimes(n));
	}
	public static int countPrimes(int n) 
	{
		int i = 1 , num = 2, count = 0;
		
		while(i < n)
		{
			int j = 2;
			while(j < num)
			{
				if(num % j == 0)
				{
					break;
				}
				j++;
			}
			if(j == num)
			{
				count++;
			}
			i++;
			num++;
		}
		return count;
	}
}