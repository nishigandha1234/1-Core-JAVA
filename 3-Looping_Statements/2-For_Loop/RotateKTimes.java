import java.util.Scanner;

class RotateKTimes
{
	public static void main(String[]x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //123456
		int rev = 0 ;
		int temp = num;
		
		while(temp != 0)
		{
			rev = rev*10 + (temp%10);
			temp/=10;
		}
		
		//find value of k & pow it
		
		
	}
}