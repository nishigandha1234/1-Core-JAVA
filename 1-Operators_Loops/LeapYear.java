import java.util.*;

public class LeapYear
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year : ");
		int year = sc.nextInt();
		
		System.out.println(year % 4 != 0 ? (year)+" Not a LEAP Year" : year%100==0 && year%400!=0 ? (year)+" Not a LEAP Year" : (year)+" It's a LEAP Year");
	}
}
		