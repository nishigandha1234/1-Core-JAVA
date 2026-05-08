/*1925. Count Square Sum Triples
A square triple (a,b,c) is a triple where a, b, and c are integers and a2 + b2 = c2.Given an integer n, return the number of square triples such that 1 <= a, b, c <= n.
Example 1: Input: n = 5 Output: 2*/

class CountSquareSumTriples
{
	public static void main(String x[])
	{
		int n = 5;
		System.out.println(countTriples(n));
	}
	public static int countTriples(int n) 
	{
        int count = 0 ;
		
		for(int a = 1 ; a <= n ; a++)
		{
			for(int b = 1 ; b <= n ; b++)
			{
				for(int c = 1 ; c <= n ; c++)
				{
					if(a*a + 
					if(a*a + b*b == c*c)
					{
						count++;
					}
				}
			}
		}
		return count;
    }
}