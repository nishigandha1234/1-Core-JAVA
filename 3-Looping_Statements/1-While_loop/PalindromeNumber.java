import java.util.*;

public class PalindromeNumber
{
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		
		while(n != 0)
		{
			rev = rev*10 +(n%10);
			n/=10;
		}
		if(temp == rev){
			System.out.println("Palindrome");
		}
		else
		{
		System.out.println("Not Palindrome");
		}
			
	}
}