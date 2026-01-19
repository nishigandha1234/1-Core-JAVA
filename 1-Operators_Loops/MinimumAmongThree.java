import java.util.Scanner;

public class MinimumAmongThree
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the Third Number : ");
		int num3 = sc.nextInt();
		
		System.out.println(num1 < num2 && num1 < num3 ? (num1)+ " is Smaller" : num2 < num3 && num2 < num1 ? (num2)+ " is Smaller" : (num3)+ " is Smaller");
	}
}