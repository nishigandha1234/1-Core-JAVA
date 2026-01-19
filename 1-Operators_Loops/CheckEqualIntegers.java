import java.util.*;

public class CheckEqualIntegers
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number 1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter a Number 2 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1==num2 ? "Both numbers have the same value" : "Both numbers NOT having the same value");
	}
}
		