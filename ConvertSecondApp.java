import java.util.*;

public class ConvertSecondApp
{
	public static void main(String x[])
	{		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Seconds : ");
		int sec = sc.nextInt();
		
		int hours = sec / 3600; 
		int remSec = sec % 3600;
		
		int minutes = remSec / 60;
		
		int seconds = remSec % 60;
		
		System.out.println("Hours : "+hours);
		System.out.println("Minutes : "+minutes);
		System.out.println("seconds : "+seconds);
	}
}