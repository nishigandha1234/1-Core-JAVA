import java.util.*;

public class MinimumBetTwo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) System.out.println((num2)+" is Smaller");
		else System.out.println((num1)+" is Smaller");
	}
}