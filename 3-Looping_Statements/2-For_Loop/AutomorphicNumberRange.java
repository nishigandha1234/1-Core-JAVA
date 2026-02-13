import java.util.Scanner;

class AutomorphicNumberRange
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int i = 1 ; i < n ; i++)
		{
			int num = i;
			int square = i*i;
			int temp;
			for(temp=num; temp!=0 ; temp/=10)
			{
				if(temp%10 != square%10)
					break;
					
				square/=10;
			}
			if(temp==0) System.out.println(num+" ");
		}
	}
}