import java.util.Scanner;

class PerfectNumberRangeFor
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int num = 1 ; num<= n ; num++)
		{
			int sum = 0 ;
			for(int i = 1 ; i<num; i++)
			{
				if(num%i==0)
				{
					sum+=i;
				}
			}
			if(sum==num && num!=0)
			{
				System.out.print(num+" ");
			}
		}
	}

}