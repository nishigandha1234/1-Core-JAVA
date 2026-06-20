/*26. Check whether a string contains only lowercase letters*/

import java.util.Scanner;
class StringContainsLowercaseAlphabets26
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		boolean flag = true;
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(!(ch >= 'a' && ch <= 'z'))
				flag = false;
		}
		if(!flag)
			System.out.println("String is NOT containing ONLY Lowercase Alphabets");
		else 
			System.out.println("String is containing Lowercase Alphabets");
	}
}