import java.util.*;

public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i < num)
		{
			if(num % i == 0)
			{
				sum += i;
			}
			i++;
		}
		System.out.println("The Sum of Factors of " + num + " is : "+ sum);
	}
}