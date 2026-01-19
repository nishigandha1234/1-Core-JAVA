import java.util.Scanner;

public class FindMiddle
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the three number : ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 < num2 && num2 < num3 ? (num2)+ " is middle" :  num3 > num1 && num3 < num2 ? (num3)+ " is middle" :  num2 < num1 && num2 > num3 ? 
		(num2)+ " is middle" : "NA" );
	}
}