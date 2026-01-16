import java.util.*;

class ToggleCase
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Character : ");
		char ch = sc.next().charAt(0);
		
		char result =
			(ch >= 'A' && ch <= 'Z') ? (char)(ch + 32) : (ch >= 'a' && ch <= 'z') ? (char)(ch - 32) : '\0';

		System.out.println((result != '\0') ? result : "Not an Alphabet");
	}
}