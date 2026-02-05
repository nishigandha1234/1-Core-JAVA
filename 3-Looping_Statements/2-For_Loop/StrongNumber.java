import java.util.Scanner;

class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int fact = 1;
		int num = sc.nextInt();
		
		for(int i = num ; i > 0; i--)
		{
			fact *= i;
		}
		if(num == fact)	System.out.println("Strong Number");
		else System.out.println("NOT Strong Number");
	}
}