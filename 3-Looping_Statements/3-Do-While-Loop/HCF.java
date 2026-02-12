import java.util.Scanner;

public class HCF
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a = 0;
		
		int i =1;
		do
		{
			if(num1%i==0 && num2%i==0)
			{
				a = i;
			}
			i++;
		}while(i<=num1);
		System.out.println(a+" ");	
	}
}