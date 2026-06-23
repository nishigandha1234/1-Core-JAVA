/*70. Convert a sentence into snake_case*/

import java.util.Scanner;
class ConvertSentenceSnakecase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : "
		System.out.println("Enter the String : ");
		String s = sc.nextLine(); 
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) == ' ')
				ans += "_"; 
			else
				ans += s.charAt(i);
		}
		System.out.println("Snake Case : "+ans);
    }
}