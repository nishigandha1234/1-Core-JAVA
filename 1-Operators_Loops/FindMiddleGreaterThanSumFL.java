import java.util.Scanner;

public class FindMiddleGreaterThanSumFL
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = (num%10)+(num/10)/10;
		
		num/=10;
		int remMid = num%10;
		System.out.println(remMid);
		
		System.out.println(remMid > sum ? "Greater" : "NOT Greater");
		
		
	}
}