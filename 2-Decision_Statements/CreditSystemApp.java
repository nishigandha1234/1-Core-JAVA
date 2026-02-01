import java.util.*;

public class CreditSystemApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Current Credit Score : ");
		int cc = sc.nextInt();
		
		if(cc >= 750)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}