import java.util.*;

public class CheckAlphabetDigSS
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <='z')
		{
			System.out.println("Alphabet");
		}
		else if(ch >= '0' && ch <= '9')
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Symbol");
		}
	}
}