/*22. Find the smallest character in a string.*/

import java.util.Scanner;
class FindSmallestCharacter22
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next();
		char smallest = s.charAt(0);
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch < smallest)
				smallest = ch;
		}
		System.out.println("Smallest : "+smallest);
	}
}