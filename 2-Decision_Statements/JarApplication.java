import java.util.*;

public class JarApplication
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int n = 10;
		System.out.println("Number of Candies Available is : " + n);
		System.out.println("Number of minimum candies that must be inside JAR : ");
		int k = sc.nextInt();
		
		if(k > 5 ) System.out.println("INVALID INPUT ");
		if(k <= 5)
		{
			System.out.println("NUMBER OF CANDIES SOLD : " + (k));
			System.out.println("NUMBER OF CANDIES AVAILABLE : "+ (n-k));
		}
		else if(k == 0) 
		{
			System.out.println("INVALID INPUT ");
			System.out.println("NUMBER OF CANDIES LEFT : " + k);
		}
	}
}
			