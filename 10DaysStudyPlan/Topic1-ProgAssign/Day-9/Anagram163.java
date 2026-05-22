/*4. Check Anagram*/

import java.util.*;
class Anagram163
{
	public static void main(String x[])
	{
		String s1= "silent";
		String s2 = "listen";
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean flag = true;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != b[i])
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Anagram");
		else
			System.out.println("NOT Anagram");
	}
}