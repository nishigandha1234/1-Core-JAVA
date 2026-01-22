import java.util.*;

public class MinimumBetnThree
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) 
		{
			System.out.println((num1)+" is Smaller");
		}
		else if(num1 > num2 && num2 < num3) 
		{
			System.out.println((num2)+" is Smaller");
		}
		else if(num1 > num3 && num3 < num2)
		{
			System.out.println((num3)+" is Smaller");
		}
		else 
		{
			System.out.println(" Numbers are Equal");
		}
	}
}