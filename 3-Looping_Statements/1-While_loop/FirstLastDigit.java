import java.util.*;

public class FirstLastDigit
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int last = num % 10;
		
		while(num >= 10)
		{
			num /=10;
		}
		System.out.println("Last : "+last);
		System.out.println("First : "+num);
	}
}