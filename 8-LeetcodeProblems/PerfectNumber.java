//507. Perfect Number
//A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

class PerfectNumber
{
	public static void main(String x[])
	{
		checkPerfectNumber(6);
	}
	public static void checkPerfectNumber(int num) 
	{
		if(num <= 1) return false;
		
		int sum = 0;
        for(int i = 1 ; i < num ; i++)
		{
			if(num%i == 0)
			{
				sum += i;
			}
		}
		System.out.println(num +" : " +sum);
    }
}
