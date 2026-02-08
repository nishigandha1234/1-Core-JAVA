import java.util.Scanner;

public class ArmstrongNumberFor
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0;
		for(int temp = num ; temp !=0 ; temp/=10)
		{
			count++;
		}
		int sum = 0;
		
		for(int temp = num; temp != 0 ; temp/=10)
		{	
			int rem = temp%10;
			int pow = 1;
			for(int i = 1 ; i <= count; i++)
			{
				pow*=rem;
			}
			sum+=pow;
		}
		if(sum == num) System.out.println("Armstrong Number");
		else System.out.println("Not Armstrong Number");
	}
}