import java.util.*;

public class PalindromeNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //123
		int rev = ((num%10)*100) + (((num/10)%10)*10) + (num/100) ;

		if(num == rev) System.out.println((num)+" is Palindrome");
		else System.out.println((num)+ " is Not Palindrome");
	}
}