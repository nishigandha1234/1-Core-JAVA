/*51 Recursive factorial */
import java.util.Scanner;
class RecursiveFactorial
{	static int f = 1;
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("Factorial : "+fact(n));
	}
	public static int fact(int n)
	{
		if(n != 0)
		{
			f*=n;
			return fact(--n);
		}
		return f;
	}
}