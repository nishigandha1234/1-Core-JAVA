/*47 Function to find LCM 
LCM(a,b) = a*b / GCD(a,b)
*/

import java.util.*;
class FindLCM47
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt(); //12
        int b = sc.nextInt(); //18
        System.out.println("LCM = " + lcm(a, b));
	}
	public static int lcm(int a , int b)
	{
		return (a * b) / gcd(a,b);
	}
	public static int gcd(int a, int b)
	{
		while(b != 0)
		{
			int rem = a % b;
			a = b;
			b = rem;
		}
		return a;
	}
}