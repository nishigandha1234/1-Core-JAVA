/*63. Replace all occurrences of one substring with another.*/

import java.util.Scanner;
class ReplaceOccOfSubstring63
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine(); // I like Java, Java is easy
		System.out.println("Enter the SubString : ");
		String sub = sc.next();
		System.out.println("Enter the String want to replace : ");
		String repl = sc.next();
		
		s = s.replace(sub, repl);
		System.out.println("Updated String : "+s);
	}
}