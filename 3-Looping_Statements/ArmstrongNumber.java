import java.util.*;

public class ArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int count = 0, temp = num;
		
		//for counting loop
		while(temp != 0)
		{
			++count;
			temp/=10;
		}
		
		temp = num ;
		int sum = 0;
		//calculate the armstrong number
		while(temp != 0)
		{
			int rem = temp%10;
			int i = 1 , pow = 1;
			while(i <= count)
			{
				pow*=rem;
				i++;
			}
			sum+=pow;
			temp/=10;
		}
		
		if(sum == num) System.out.println("Armstrong Number");
		else System.out.println("Not Armstrong Number");
	}
}