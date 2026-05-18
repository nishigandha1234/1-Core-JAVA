/*45 Function to calculate power 
50. Pow(x, n)
Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
Example 1: Input: x = 2.00000, n = 10 Output: 1024.00000*/

class CalculatePower45
{
	public static void main(String x[])
	{
		double base = 2;
		int index = 10;
		System.out.println(pow(base, index));
	}
	public static double pow(double base, int index)
	{
		int pow = 1;
		for(int i = 1 ; i <= index ; i++)
		{
			pow *= base;
		}
		return pow;
	}
}