/*75. Implement string compression (Example: aaabbcc → a3b2c2).*/

import java.util.Scanner;
class StringCompression
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next(); //"aaabbcc"
		String ans = "";
		int[] freq = new int[26];
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			freq[ch-'a']++;			
		}
		for(int i = 0 ; i < 26 ; i++)
		{
			if(freq[i] > 0)
			{
				ans += (char)(i + 'a') + "" + freq[i];
			}
		}
		System.out.println(ans);
	}
}