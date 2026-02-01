import java.util.*;

public class SumOfOddNum
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number Between 1 to 100 : ");
		int i = 1, sum = 0;
		while(i <= 10)
		{
			if(i % 2 != 0)
			{
				sum += i;
			}
			i++;
		}
		System.out.println("Sum of Odd Numbers : "+ sum);
	}
}