import java.util.*;

public class PerformOperationSwitch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Two Numbers : ");
		int no1 = sc.nextInt();
		int no2 = sc.nextInt();
		System.out.println("Enter the Operation want to Perform from Below : ");
		System.out.println("1. Addition : ");
		System.out.println("2. Subtraction : ");
		System.out.println("3. Multiply : ");
		System.out.println("4. Division : ");
		System.out.println("5. Modulus : ");
		
		int operation = sc.nextInt();
		
		switch(operation)
		{
			case 1 : 
			{
				int ans = no1+no2;
				System.out.println("Addition of Two Numbers is :" + ans); 
				break;
			}
			case 2 : 
			{
				int ans = no1-no2;
				System.out.println("Subtraction of Two Numbers is :" + ans);
				break;				
			}
			case 3 : 
			{
				int ans = no1*no2;
				System.out.println("Multiply of Two Numbers is :" + ans); 
				break;
			}
			case 4 : 
			{
				int ans = no1/no2;
				System.out.println("Division of Two Numbers is :" + ans); 
				break;
			}
			case 5 : 
			{
				int ans = no1%no2;
				System.out.println("Modulus of Two Numbers is :" + ans); 
				break;
			}
			default :
			{
				System.out.println("Invalid Operation entered");
			}
		}
	}
}