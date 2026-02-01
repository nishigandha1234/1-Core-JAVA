import java.util.*;

public class CountDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int count = 0;
		
		while(n != 0)
		{
			n/=10;
			count++;
		}
		System.out.println("The Number of Digit is : " + count);
	}
}
		