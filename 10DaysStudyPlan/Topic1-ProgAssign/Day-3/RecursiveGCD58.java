/*58 Recursive GCD */

class RecursiveGCD58
{
	public static void main(String x[])
	{
		int a = 12;
		int b = 18;
		System.out.println(gcd(a,b));
	}
	public static int gcd(int a, int b)
	{
		if(b == 0)
		{
			return a;	
		}
		
		return gcd(b, a%b);
	}
}