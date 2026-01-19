import java.util.Scanner;

class Palindrome
{
	public static void main(String[]x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		
		int rev = ((num%10)*100) + (((num/10)%10)* 10)+ (num/100);
		System.out.println("Reversed : "+ rev);
		if(rev == num)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
	}
}