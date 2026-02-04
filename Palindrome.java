import java.util.*;

public class Palindrome
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt(); //1221
		int rev = (num%10)*1000+((num/10)%10)*100 + ((num/100)%10)*10 + num/1000;
//						1000+			200					200				1
//							1221==1221 -> Palindrome
		System.out.println(num == rev ? "The Number is Palindrome" : "The Number is NOT Palindrome");
	}
}