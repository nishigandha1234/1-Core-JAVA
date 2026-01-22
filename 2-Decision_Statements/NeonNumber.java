import java.util.*;

public class NeonNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int number = sc.nextInt();
		int square = number*number;
		int sumofSqu = (square%10)+(square/10);
		if(number == sumofSqu) System.out.println((number)+" is a Neon Number");
		else System.out.println((number)+" is NOT Neon Number");
	}
}