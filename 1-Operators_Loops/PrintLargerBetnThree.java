import java.util.Scanner;

public class PrintLargerBetnThree
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

		System.out.println(remFirst > remMid && remFirst > remLast ? (remFirst)+ " is Greater" : remMid > remFirst && remMid > remLast ? (remMid)+ " is Greater" : remLast > remFirst && remLast > remMid ? (remLast)+ " is Greater" : "NA");
	}
}