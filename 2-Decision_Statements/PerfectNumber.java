import java.util.*;

public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		if(num%10 == 0 || num%10 == 1 || num%10 == 4 ||  num%10 == 5 || num%10 == 6 ||  num%10 == 9) System.out.println((num)+" Perfect Number");
		else System.out.println((num)+" NOT Perfect Number");
	}
}