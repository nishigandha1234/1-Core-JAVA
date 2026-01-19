import java.util.Scanner;

public class PrintLargerBetnFirstLast
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three digit Number : ");
		int num = sc.nextInt();

		int remLast = num%10;
		num/=10;
		int remMid = num%10;
		num/=10;
		int remFirst = num%1000;

		System.out.println(remFirst < remLast ? remLast+ " is Greater" : remFirst > remLast ? remFirst+ " is Greater" : "Middle is Greater");
	}
}