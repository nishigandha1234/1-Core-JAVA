import java.util.*;

public class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		int fact = 1;
		
		while(temp != 0)
		{
			fact*=temp;
			temp--;
		}
		if(fact == temp) System.out.println(num + " is Strong Number");
		else System.out.println(num + " is NOT Strong Number");
	}
}