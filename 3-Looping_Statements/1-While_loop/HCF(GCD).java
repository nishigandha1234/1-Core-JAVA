import java.util.Scanner;

public class HCF(GCD)
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a,b;
		
		int i =1;
		if(num1<num2)
		{
			while(i<num1)
			{
				if(num1%i==0)
				{
					a = i;
				}
				if(num2%i==0)
				{
					b = i;
				}
				i++;
			}
			if(a==b)
			{
				System.out.print(a);
			}
		}
	}
}