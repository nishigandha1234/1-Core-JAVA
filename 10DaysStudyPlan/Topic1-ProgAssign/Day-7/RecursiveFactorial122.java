/*122 Recursive function for factorial LC 509 */

import java.util.Scanner;
class RecursiveFactorial122
{
	static int fact = 1;
	
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //5
		System.out.println(fact(num));
	}
	public static int fact(int num)
	{
		if(num == 0)
			return 1;
		else
			return num*fact(num-1);
	}
}