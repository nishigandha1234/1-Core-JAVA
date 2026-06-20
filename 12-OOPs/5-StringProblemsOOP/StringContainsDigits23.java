/*23. Check whether a string contains only digits.*/

import java.util.Scanner;
class StringContainsDigits23
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
			if(!(ch >= '0' && ch <= '9'))
				flag = false;
		}
		if(!flag)
			System.out.println("String is NOT containing ONLY Digits");
		else 
			System.out.println("String is containing Digits");
	}
}