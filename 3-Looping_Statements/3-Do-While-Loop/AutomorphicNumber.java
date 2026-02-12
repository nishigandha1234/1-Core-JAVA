import java.util.Scanner;

class AutomorphicNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int num = sc.nextInt();
		int temp = num;
		int squ = num*num;
	
		do
		{
			if(temp%10 == squ%10){
				System.out.println("Automorphic Number");
				return;
			}
			temp/=10;
			squ/=10;
		}
		while(temp!=0);
		
		System.out.println("Not Automorphic Number");
	}	
}