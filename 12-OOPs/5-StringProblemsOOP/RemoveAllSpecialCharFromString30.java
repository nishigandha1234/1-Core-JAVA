/*30. Remove all special characters from a string.*/

import java.util.Scanner;
class RemoveAllSpecialCharFromString30
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
			if((ch >= '0' && ch <= '9')||(ch >= 'A' && ch <= 'Z')||(ch >= 'a' && ch <= 'z'))
				ans += ch;
		}
		System.out.println(ans);
	}
}