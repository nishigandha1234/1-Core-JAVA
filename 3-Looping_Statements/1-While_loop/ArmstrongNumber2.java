import java.util.*;

public class ArmstrongNumber2
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num , count = 0;
		
		while(temp != 0)
		{
			++count;
			temp/=10;
		}
		
		temp = num;
		int sum = 0;
		while(temp != 0)
		{
			int pow = 1, i =1;
			int rem = temp % 10;
			while(i <= count)
			{
				pow*=rem;
				i++;
			}
			sum+=pow;
			temp/=10;
		}
		if(sum == num) System.out.println(num + " is Armstrong Number);
		else System.out.println(num + " is Armstrong Number);
		else System.out.println(num + " is NOT Armstrong Number);
	}
}
	