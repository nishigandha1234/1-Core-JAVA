import java.util.*;

public class CalculateTemperature
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celcius : ");
		double temperature = sc.nextDouble();
		
		if(temperature < 0) 
			System.out.println("Freezing");
		else if(temperature >= 0 && temperature < 20)
			System.out.println("Cold");
		else if(temperature > 21 && temperature < 35)
			System.out.println("Warm");
		else if(temperature > 35)
			System.out.println("Hot");
		
	}
}