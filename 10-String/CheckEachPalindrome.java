/* Q9. Write a java program to check each word separately to see if it reads same forward and backward. 
Input : madam level noon java Output : madam level noon */

import java.util.*;
class CheckEachPalindrome
{	
	public static void main(String x[])
	{
		String s = "madam level noon java";
		palindromeWord(s);
	}
	public static void palindromeWord(String s)
	{
		String[] str = s.split(" ");
		
		for(int i = 0 ; i < str.length ; i++)
		{
			String word = str[i];
			String rev = "";
			for(int j = word.length()-1 ; j >= 0 ; j--)
			{
				rev += word.charAt(j);
			}
			if(rev.equals(word))
			{
				System.out.print(word+" ");
			}
		}
	}
}