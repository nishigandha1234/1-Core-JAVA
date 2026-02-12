import java.util.Scanner;

class Reverse
{
	public static void main(String x[])
	{
		
		int n = 12345;
		int rev = 0;
		while(n != 0)
		{
			rev = rev*10+(n%10);
			n/=10;
		}
		System.out.println(rev);
	}
}