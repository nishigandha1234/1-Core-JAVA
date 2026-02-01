import java.util.*;

public class SumOfEvenNumbers
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Between 1 to 100 : ");
		int i = 2, sum = 0;
		while(i <= 10)
		{
			if(i % 2 == 0)
			{
				sum+=i;
			}
			i++;
		}
		System.out.println("Sum of EVEN Numbers is : "+ sum);
	}
}