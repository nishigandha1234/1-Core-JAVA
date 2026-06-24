/*73. Implement your own version of `String.indexOf()`.*/

import java.util.Scanner;
class ImplementIndexOfMethod
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String and Character : ");
		String s1 = sc.next();;	
		char ch = sc.next().charAt(0);	
		int index = -1;
		for(int i = 0 ; i < s1.length() ; i++)
		{
			if(s1.charAt(i) == ch)
				index = i;
		}
		System.out.println(index);
	}
}