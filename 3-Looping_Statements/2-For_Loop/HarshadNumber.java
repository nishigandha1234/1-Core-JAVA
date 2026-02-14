import java.util.Scanner;

//Examples: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20, 21, 24, 27, 30, 100, 1729.
//Non-Examples: 11 (,11 is not divisible by 2), 22(,22 is not divisible by 4).
class HarshadNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int i =1 ; i <= n; i++)
		{
			int num = i;
			int sum = 0;
			while(num != 0)
			{
				int rem = num%10;
				sum += rem;
				num/=10;
				
			}
			if(i%sum==0)
			{
				System.out.print(i+" ");
			}
		}
	}
}
