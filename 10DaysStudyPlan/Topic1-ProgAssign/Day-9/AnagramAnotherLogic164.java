/*4. Check Anagram*/

import java.util.*;
class AnagramAnotherLogic164
{
	public static void main(String x[])
	{
		String s1= "silent";
		String s2 = "listen";
		checkAnagram(s1,s2);
	}
	public static void checkAnagram(String s1, String s2)
	{
		if(s1.length() != s2.length())
			System.out.println("Not Anagram");
		
		int[] count = new int[256];
		boolean flag = true;
		for(int i = 0 ; i < s1.length() ; i++)
		{
			count[s1.charAt(i)]++;
			count[s2.charAt(i)]--;
		}
		for(int i = 0; i < count.length ; i++)
		{
			if(count[i] != 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Angaram");
		else
		 System.out.println("Not Angaram");
	}
}