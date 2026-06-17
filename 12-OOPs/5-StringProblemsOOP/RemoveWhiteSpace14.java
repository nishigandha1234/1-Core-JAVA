/*14. Remove all white spaces from a string.*/

import java.util.Scanner;
class RemoveWhiteSpace14
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
			
			if(ch != ' ')
			{
				ans += ch;
			}
		}
		System.out.println("After removing White Space : "+ans);
	}
}