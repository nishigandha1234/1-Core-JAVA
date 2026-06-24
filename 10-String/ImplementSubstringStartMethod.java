/*74. Implement your own version of `String.substring()`.*/

import java.util.Scanner;
class ImplementSubstringStartMethod
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String and Character : ");
		String s1 = sc.next();
		System.out.println("Enter the Starting Index : ");
		int start = sc.nextInt();
		String ans = "";
		for(int i = start ; i < s1.length() ; i++)
		{
			ans += s1.charAt(i);
		}
		System.out.println(ans);
	}
}