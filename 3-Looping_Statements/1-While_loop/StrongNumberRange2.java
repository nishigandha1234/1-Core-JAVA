import java.util.Scanner;
//135= 1!+3!+5! = 135
class StrongNumberRange2
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		for(int j=1 ; j<= n;j++)
		{
			int num = j;
			int temp = num;
			int sum = 0;
			while(temp != 0)
			{
				int rem = temp%10;
				int fact =1;
				for(int i=1 ;i<= rem ; i++)
					fact*=i;
				sum+=fact;
				temp/=10;
			}
			System.out.print(sum==num? num:"");
		}
	}
}
