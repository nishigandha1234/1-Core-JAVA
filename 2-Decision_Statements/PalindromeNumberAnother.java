import java.util.*;

public class PalindromeNumberAnother
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); 
		int rem = num%10;
		int rev = 0;
		rev = rev*10 + rem;
		num/=10;
		System.out.println(rev);
		if(num == rev) System.out.println((num)+" is Palindrome");
		else System.out.println((num)+ " is Not Palindrome");
	}
}