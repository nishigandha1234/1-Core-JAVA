import java.util.*;

public class LeapYear
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int year = sc.nextInt();
		
		if(year%4 == 0 && year%100 == 0 && year%400==0)
		{
			System.out.println((year)+ " LEAP Year");
		}
		else{
			System.out.println((year)+" Not a LEAP year");
		}
	}
}