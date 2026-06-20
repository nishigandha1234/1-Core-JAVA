/*29. Remove all digits from a string*/

import java.util.Scanner;
class RemoveAllDigitsFromString29
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(!(ch >= '0' && ch <= '9'))
				ans += ch;
		}
		System.out.println(ans);
	}
}