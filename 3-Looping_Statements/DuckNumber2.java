import java.util.*;

public class DuckNumber2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		boolean isDuck = false;
		
		while(num != 0)
		{
			if(num % 10 == 0)
			{
				isDuck = true;
				break;
			}
			num/=10;
		}
		if(isDuck) System.out.println("Its Duck Number");
		else System.out.println("Its NOt Duck Number");
	}
}