/*77. Implement Run Length Encoding (RLE).*/

import java.util.Scanner;
class RunLengthEncoding
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next(); //"aaannncsd"
		int[] freq = new int[26];
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			freq[ch-'a']++;
		}
		for(int i = 0 ; i < freq.length ; i++)
		{
			if(freq[i] > 0)
			{
				ans += (char)(i+ 'a')+""+ freq[i];
			}
		}
		System.out.println(ans);
	}
}