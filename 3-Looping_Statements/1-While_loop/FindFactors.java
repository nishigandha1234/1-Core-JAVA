import java.util.*;

public class FindFactors
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int i = 1 ;
		
		while(i < num)
		{
			if(num % i == 0)
			{
				System.out.println("The Factors of Number are : " + i + " ");
			}
			i++;
		}
	}
}