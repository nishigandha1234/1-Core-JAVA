import java.util.*;

public class DecideHeight
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Height : ");
		double PerHeight = sc.nextDouble();
		
		if(PerHeight < 150.0)
		{	
			System.out.println("The person is Dwarf.");
		}
		else if(PerHeight >= 150.0 && PerHeight < 165.0)
		{
			System.out.println("The person is Average heighted.");
		}
		else if( PerHeight >= 165.0 && PerHeight <= 195.0)
		{
			System.out.println("The person is taller.");
		}
	}
}
		