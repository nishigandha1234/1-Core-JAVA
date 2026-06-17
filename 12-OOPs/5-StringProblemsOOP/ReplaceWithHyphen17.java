/*17. Replace all spaces with hyphens.*/

import java.util.Scanner;
class ReplaceWithHyphen17
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		String ans = "";
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == ' ')
			{
				ans += "-";
			}
			else
			{
				ans += ch;
			}
		}
		System.out.println(ans);
	}
}