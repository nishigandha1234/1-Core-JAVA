/*50 Function returning largest of three numbers*/

import java.util.*;
class LargestOfThreeNumbers50
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println(largestNum(a,b,c));
	}
	public static int largestNum(int a, int b, int c)
	{
		if(a > b && a > c)
			return a;
		else if(b > a && b > c)
			return b;
		else 
			return c;
	}
}