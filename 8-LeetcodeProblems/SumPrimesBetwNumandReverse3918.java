/*3918. Sum of Primes Between Number and Its Reverse
You are given an integer n.Let r be the integer formed by reversing the digits of n.Return the sum of all prime numbers between min(n, r) and max(n, r), inclusive.
Example 1: Input: n = 13 Output: 132
Explanation: The reverse of 13 is 31. Thus, the range is [13, 31]. The prime numbers in this range are 13, 17, 19, 23, 29, and 31. The sum of these prime numbers is 13 + 17 + 19 + 23 + 29 + 31 = 132.*/

class SumPrimesBetwNumandReverse3918
{
	public static void main(String x[])
	{
		int n = 13;
		System.out.println(sumOfPrimesInRange(n));
	}
	public static int sumOfPrimesInRange(int n) 
	{
       int rev = 0;
        int temp = n;
        while(temp != 0)
        {
            int rem = temp% 10;
            rev = rev*10 + rem;
            temp /=10;
        }
		int min = Math.min(n, rev);
		int max = Math.max(n, rev);
		int sum = 0;
		for(int i = min ; i <= max ; i++)
		{
			if(isPrime(i))
			{
				sum += i;
			}
		}
		return sum;
	}
	public static boolean isPrime(int n)
	{
		if(n <= 1) return false;
		boolean flag = true;
		for(int i = 2 ; i*i <= n ; i++)
		{
			if(n % i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}