import java.util.*;

public class DecideRangeOfNumbers
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Number 2 : ");
		int num2 = sc.nextInt();
		
		if(num1 < num2) System.out.println("Number 1 is Smaller");
		else if(num1 == num2) System.out.println("Both Numbers are Equal");
		else if(num1 > num2) System.out.println("Number 2 is Greater");	
	}
}