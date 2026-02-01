import java.util.*;

public class SeasonPrinting
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Month : ");
		int month = sc.nextInt();
		
		if(month >=2 && month <= 11) System.out.println("Winter");	
		else if(month >=3 && month <= 4) System.out.println("Spring");
		else if(month >=5 && month <= 6) System.out.println("Summer");
		else if(month >=6 && month <= 9) System.out.println("Monsoon");	
		else if(month >=10 && month <= 11) System.out.println("Autumn");	
		else System.out.println("Invalid Month");	
	}
}