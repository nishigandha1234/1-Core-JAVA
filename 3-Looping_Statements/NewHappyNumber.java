import java.util.*;

public class NewHappyNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int temp = num, sum = 0, flag = 0;
		
		while(sum != 1 && sum != 4)
		{
			while(num > 0)
			{
				int rem = num%10;
				sum += rem*rem;
				num/=10;
			}
			if(sum == 1)
				flag = 1;
			else if(sum == 4)
				flag = 0;
			else 
				num = sum;
		}
		if(flag == 1)
			System.out.println("Happy Number");
		else 
			System.out.println("Happy Number");
	}
}
				