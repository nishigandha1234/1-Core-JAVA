import java.util.Scanner;

class AutomorphicNumber
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //5
		int square = num*num; //25
		
		//		
		for(int temp = num ; temp != 0 ; temp/=10)
		{
			int rem = temp%10;
			if(temp%10 != square%10)
			{
				System.out.println("NoT Automorphic Number");
				return;
			}
			square/=10;
		}
		System.out.println("Automorphic Number");
	}
}