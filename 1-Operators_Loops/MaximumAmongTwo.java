import java.util.Scanner;

public class MaximumAmongTwo
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 > num2 ? (num1)+ " is Greater" : (num2)+ " is Greater");
	}
}