/*28. Print characters at odd indexes.*/

import java.util.Scanner;
class PrintOddIndexChar28
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(i % 2 != 0)
				System.out.print(ch+" ");
		}
	}
}