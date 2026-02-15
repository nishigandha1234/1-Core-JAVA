import java.util.Scanner;

public class ArmStrongNumber
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num , count = 0;
		while(temp != 0)
		{
			count++;
			temp/=10;
		}
		int sum = 0; 
		temp = num;
		while(temp!=0)
		{
			int rem = temp % 10;
			int i =1 , pow  = 1;
			while(i <= count)
			{
				pow*=rem;
				i++;
			}
			sum+= pow;
			temp/=10;
		}
		
		if(sum==num) System.out.println("Armstrong");
		else System.out.println("Not Armstrong");
	}
}