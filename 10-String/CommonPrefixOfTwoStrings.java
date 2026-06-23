/*66. Find the common prefix of two strings.*/

import java.util.Scanner;
class CommonPrefixOfTwoStrings
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1 : ");
		String s1 = sc.next(); 
		System.out.println("Enter the String 2 : ");
		String s2 = sc.next();
		
		String prefix = ""; 
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		int len ;
		if(s1.length() < s2.length())
			len = s1.length();
		else
			len = s2.length();
		
		for(int i = 0 ; i < len; i++)
		{
			if(s1.charAt(i) == s2.charAt(i))
				prefix += s1.charAt(i);
			else
				break;
		}
		if(prefix.length() > 0)
            System.out.println("Prefix : "+prefix);
        else
            System.out.println("No prefix");
    }
}