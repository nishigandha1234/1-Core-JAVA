import java.util.*;

public class QuotientRemainder
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int quotient = num / 10;
		int remainder = num % 10;
		
		System.out.println("quotient : " + quotient);
		System.out.println("remainder : "+ remainder);
	}
}