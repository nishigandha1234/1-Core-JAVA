import java.util.*;

public class MaximumBetTwo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 > num2) System.out.println((num1)+" is Greater");
		else System.out.println((num2)+" is Greater");
	}
}