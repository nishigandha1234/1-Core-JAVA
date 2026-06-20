/*25. Check whether a string contains only uppercase letters.*/

import java.util.Scanner;
class StringContainsUppercaseAlphabets25
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
			if(!(ch >= 'A' && ch <= 'Z'))
				flag = false;
		}
		if(!flag)
			System.out.println("String is NOT containing ONLY Uppercase Alphabets");
		else 
			System.out.println("String is containing Uppercase Alphabets");
	}
}