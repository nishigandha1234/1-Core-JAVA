/* Q7. Write a Java program to find longest palindrome substring using loops. 
Input: Enter string: babad 
Output: Longest palindrome is: bab */

class LongestPalidromicSubstring
{
	public static void main(String x[])
	{
		String s = "babad";
		longestPalindrome(s);
	}
	public static void longestPalindrome(String s)
	{
		String longest = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			for(int j = i ; j < s.length() ; j++)
			{
				String temp = s.substring(i, j+1);
				if(isPalindrome(temp))
				{
					if(temp.length() > longest.length())
						longest = temp;
				}
			}
		}
		System.out.println(longest);
	}
	public static boolean isPalindrome(String temp)
	{
		String rev = "";
		for(int i = temp.length()-1 ; i >= 0 ;i--)
		{
			rev += temp.charAt(i);
		}
		if(rev.equals(temp))
			return true;
		else
			return false;
	}
}