import java.util.Scanner;

class StrongNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int sum = 0;

		for(int temp = num; temp != 0 ; temp/=10)
		{
			int rem = temp%10;
			int fact =1;
			for(int i = 1 ; i <= rem ; i++)
				fact *= i;
			sum+=fact;
		}
		if(sum == num)	System.out.println("Strong Number");
		else System.out.println("NOT Strong Number");
	}
}