/*61. Count all palindromic substrings.*/

import java.util.Scanner;
class CountPalindromicSubstring61
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();//abba
		int count = 0 ;
		for(int i = 0 ; i < s.length() ; i++)
		{
			for(int j = i ; j < s.length() ; j++)
			{
				String sub = s.substring(i, j+1);
				if(isPalindrome(sub))
				{
					count++;
				}
			}
		}
		System.out.println("Count : "+count);
	}
	public static boolean isPalindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		
		while(start < end)
		{
			if(str.charAt(start) != str.charAt(end))
			{
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}