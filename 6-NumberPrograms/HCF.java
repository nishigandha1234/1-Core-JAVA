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
		while(i<=num1)
		{
			if(num1%i==0 && num2%i==0)
			{
				a = i;
			}
			i++;
		}
		System.out.println("Number 1 "+num1+"and Number 2 "+num2+"HCF is " + a);	
	}
}