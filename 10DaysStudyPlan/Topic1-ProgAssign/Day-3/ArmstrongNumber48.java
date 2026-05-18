/*48 Function to check Armstrong number */

import java.util.*;
class ArmstrongNumber48
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); // 153
		//System.out.println(isArmstrongNum(num));
		isArmstrongNum(num);
	}
	public static void isArmstrongNum(int num)
	{
		int temp = num;
		int count = 0;
		
		while(temp != 0)
		{
			count++;
			temp /=10;
		}
		temp = num;
		int sum = 0;
		while(temp != 0) //153 != 0
		{
			int fact = 1;
			int rem = temp % 10;
			for(int i = 1 ; i <= count ; i++)
			{
				fact *= rem;
			}
			sum += fact;
			System.out.println(sum );
			System.out.println(fact );
			temp/=10;
		}
		System.out.println(sum == num ? "ArmStrong": "NOT ArmStrong");
	}
}