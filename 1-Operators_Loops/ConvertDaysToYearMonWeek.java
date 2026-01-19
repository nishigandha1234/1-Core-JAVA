import java.util.*;

public class ConvertDaysToYearMonWeek
{	
	public static void main(String[] x)
	{	
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		
		int years = days / 365;
		
		int remDays = days % 365;
		
		int months = remDays / 30;
		int rem2 = remDays % 30;
		int weeks = rem2 / 7;
		
		System.out.println("Years : "+ years);
		System.out.println("Months : "+ months);
		System.out.println("Weeks : "+ weeks);
	}
}
		
		
		
		