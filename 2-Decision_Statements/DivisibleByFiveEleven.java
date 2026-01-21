import java.util.*;

public class DivisibleByFiveEleven
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num1 = sc.nextInt();
		
		if(num1 % 5 == 0 && num1 % 11 == 0 )
		{
			System.out.println("Number is Divisible By Five & Eleven");
		}
		else{
			System.out.println("Not Divisible By Five & Eleven");
		}
	}
}