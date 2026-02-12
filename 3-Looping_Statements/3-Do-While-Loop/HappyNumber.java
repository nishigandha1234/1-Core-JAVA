import java.util.*;

public class HappyNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num;
		
		
		do
		{
			int sum = 0;
			
			do
			{
				int rem = temp%10;
				sum += rem*rem;
				temp/=10;
			}while(temp > 0);
			temp = sum;
		}
		while(temp != 1 && temp != 4);
		
		if(temp == 1) System.out.println("Happy Number");
		else System.out.println("Not Happy Number");
	}
}
		
		