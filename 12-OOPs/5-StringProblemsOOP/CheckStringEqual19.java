/*19. Check whether two strings are equal.*/

import java.util.Scanner;
class CheckStringEqual19
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Strings are not equal...");
			return;
		}
		if(str1.equals(str2))
				System.out.println("Strings are Equal");
		else
			System.out.println("Strings are NOT Equal");
	}
}