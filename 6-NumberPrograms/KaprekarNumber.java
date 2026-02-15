import java.util.Scanner;

class KaprekarNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //45
		int sum = 0, count = 0;
		int square = num*num;//2025
		int temp = square;
		
		while(temp!=0)
		{
			count++; //4
			temp/=10;
		}
		int pow = 1;
		for(int i = 1 ; i<=count/2 ; i++)
		{
			pow*=10; //100
		}
		sum = (square/pow) + (square%pow);
		
		System.out.println(sum==num?"Kaprekar Number":"Not A Kaprekar Number");
	}
}