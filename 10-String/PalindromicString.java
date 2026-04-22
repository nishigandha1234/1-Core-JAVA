import java.util.Scanner;

class PalindromicString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		String rev = "" ;
		
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			rev += str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Palindromic String");
		}
		else
		{
			System.out.println("NOT Palindromic String");
		}
	}
}