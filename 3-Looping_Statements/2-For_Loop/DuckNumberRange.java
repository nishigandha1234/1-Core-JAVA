import java.util.Scanner;

class DuckNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		for(int i =1 ; i<=n ; i++)
		{
			int num = i;
			boolean flag = false;
			int temp = num;
			
			while(temp != 0)
			{
				int rem = temp%10;
				if(rem==0)
				{
					flag = true;
					break;
				}
				temp/=10;
			}
			if(flag)
				System.out.println(num);
		}
	}
}