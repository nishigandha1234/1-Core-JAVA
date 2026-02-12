import java.util.Scanner;

class AutomorphicNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int square = num*num;
		
		for(int temp = num; temp!=0 ;temp/=10)
		{
			if(temp%10 == square%10)
			{
				System.out.println("Automorphic Number");
				return;
			}
			square/=10;
		}
		System.out.println("Not Automorphic Number");
	
	}
}