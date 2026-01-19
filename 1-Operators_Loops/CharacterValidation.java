import java.util.Scanner;

public class CharacterValidation
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println(ch >= 'A' && ch <= 'Z' ? (ch)+ " This is Alphabet" : ch >= 'a' && ch <= 'z' ? (ch)+ " This is Alphabet" : (ch)+ " This is Numeric");
	}
}