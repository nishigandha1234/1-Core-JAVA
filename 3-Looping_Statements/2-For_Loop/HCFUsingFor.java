import java.util.Scanner;

public class HCFUsingFor
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two Numbers : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a = 0;
		
			for(int i =1 ; i<=num1; i++)
			{
				if(num1%i==0 && num2%i==0)
				{
					a = i;
				}
			}
			System.out.println(a+" ");
	}
}