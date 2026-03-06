//172. Factorial Trailing Zeroes
//Given an integer n, return the number of trailing zeroes in n!.
//Input: n = 3 Output: 0 Explanation: 3! = 6, no trailing zero.
//Input: n = 5 Output: 1 Explanation: 5! = 120, one trailing zero.

class TrailingZerosFactorial
{
	public static void main(String x[])
	{
		System.out.println(trailingZeroes(10));
	}
	public static int trailingZeroes(int n) 
	{
		int fact = 1 ; 
		int count = 0;
		for(int i = n ; i > 0 ; i--) //4<5
		{
			fact *= i; //1*5 5 2*5 10 3*10 30 4*30 120
		}
		System.out.println(fact);
		while(fact!=0)
		{
			int rem = fact % 10;
			if(== 0) count++;
		}
		return count;
    }
}