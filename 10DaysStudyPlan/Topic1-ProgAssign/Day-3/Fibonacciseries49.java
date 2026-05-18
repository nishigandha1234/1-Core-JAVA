/*49 Function to print Fibonacci series */

class Fibonacciseries49
{
	public static void main(String x[])
	{
		int n1 = 0;
		int n2 = 1;
		fibo(n1,n2);
	}
	public static void fibo(int n1, int n2)
	{
		int i = 1;
		if(i <= 2)
		{
			System.out.print(n1+",");
			System.out.print(n2+",");
			i=3;
		}
		while(i <= 10)
		{
			int a = n1+n2;
			System.out.print(a+",");
			
			n1 = n2;
			n2 = a;
			i++;
		}
	}
}