/*18. Compare two strings without using `equals()`.*/

import java.util.Scanner;
class CompareStringWithoutEquals18
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Strings are not equal...");
			return;
		}
		boolean flag = true;
		for(int i = 0 ; i < str1.length(); i++)
		{
			char ch1 = str1.charAt(i);
			for(int j = 0 ; j < str2.length() ; j++)
			{
				char ch2 = str2.charAt(j);
				
				if(ch1 != ch2)
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
			System.out.println("String are Equal...");
		else
			System.out.println("String are NOT Equal...");
	}
}