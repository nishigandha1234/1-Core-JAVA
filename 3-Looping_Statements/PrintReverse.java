import java.util.*;

public class PrintReverse
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int rev = 0;
		
		while(n != 0)
		{
			rev = rev*10 +(n%10);
			n/=10;
		}
		System.out.println(rev);
	}
}