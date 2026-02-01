import java.util.*;

public class SumFirstLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;
		int last = num % 10;
		while(num >= 10)
		{
			num /= 10;
		}
		sum = num + last;
		System.out.println("Sum of First and Last Digit is : " + sum);
	}
}
		