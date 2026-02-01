import java.util.*;

public class ArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //153
		int pow = 1, count = 0;
		int temp = num;
		
		//For Counting digits 
		while(temp != 0)
		{
			++count;
			num/=10;
		}
		
		int temp = number;
		int sum = 0;
		
		//for finding sum of digits
		while(temp != 0)
		{
			int rem = temp % 10;
			int pow = 1 ;
			
			while(i <= count)
			{
				pow *= rem;
			}
			
			sum += pow;
			temp/=10;
		}
		
		if(sum = num) System.out.println("Armstrong Number");
		else System.out.println("NOT Armstrong Number");
	}
}