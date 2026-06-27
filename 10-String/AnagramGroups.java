/*I/p : String[] arr = {"cat", "dog", "tac", "god", "act", "rat"};
O/p : [cat, tac, act] [dog, god]*/

import java.util.*;
class AnagramGroups
{		
	public static void main(String x[])
	{
		String[] arr = {"cat", "dog", "tac", "god", "act", "rat"};
		isAnagramGroup(arr);
	}
	public static void isAnagramGroup(String[] arr)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i+1 ; j < arr.length ;j++)
			{
				if(isAnagram(arr[i], arr[j]))
					System.out.println(arr[i] + " and " + arr[j] + " are anagrams");
			}
		}
	}
	public static boolean isAnagram(String s1, String s2)
	{
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
			
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1,c2);
	}
}