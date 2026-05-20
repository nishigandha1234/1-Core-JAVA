/*121 Function overloading example —*/

import java.util.Scanner;
class FunctionOverloading121
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		System.out.println("Enter b : ");
		int b = sc.nextInt();
		System.out.println("Enter c : ");
		int c = sc.nextInt();
		System.out.println(addition(a,b));
		System.out.println(addition(a,b,c));
	}
	public static int addition(int a, int b)
	{
		return a+b;
	}
	public static int addition(int a, int b, int c)
	{
		return a+b+c;
	}
}