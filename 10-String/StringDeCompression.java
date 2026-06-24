/*76. Decompress a compressed string.*/

import java.util.Scanner;
class StringDeCompression
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next(); //"a3b2c2"
		String ans = "";
		for(int i = 0 ; i < s.length() ; i+=2)
		{
			char ch = s.charAt(i);
			int count = s.charAt(i+1)-'0';
			
			for(int j = 0 ; j < count ; j++)
			{
				ans += ch;
			}
		}
		System.out.println(ans);
	}
}