import java.util.Scanner;

public class AbsoluteDifferenceTen
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Positive number 1: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the Positive number 2 : ");
		int num2 = sc.nextInt();
		
		int subtraction = num1 - num2;
		
		System.out.println(~subtraction);
		//System.out.println(subtraction < 0 ? ~subtraction : subtraction > 10 ? "Difference is greater than 10" : "Difference is Less than 10");
	}
}