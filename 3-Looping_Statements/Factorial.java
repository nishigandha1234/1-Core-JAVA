import java.util.*;

public class Factorial
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int fact = 1;
		while(n != 0)
		{	
			fact *= n;
			n--;
		}
		System.out.println(fact);
	}
}
			