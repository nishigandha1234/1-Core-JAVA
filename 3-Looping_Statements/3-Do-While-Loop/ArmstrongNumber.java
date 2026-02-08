import java.util.Scanner;

public class ArmStrongNumber
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num , count = 0;
		
		do{
			++count;
			temp/=10;
		}
		while(temp!=0);
		
		temp = num; int sum = 0;
		do{
			int rem =temp%10;
			int pow =1, i =1;
			do{
				pow*=rem;
				i++;
			}
			while(i<=count);
			
			sum+=pow;
			temp/=10;
		}
		while(temp!=0);
		
		if(sum==num) System.out.println("Armstrong");
		else System.out.println("Not Armstrong");
	}
}