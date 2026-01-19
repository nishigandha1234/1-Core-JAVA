import java.util.Scanner;

public class CharacterDigitSpeChar
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' ? (ch)+ " This is Alphabet" : ch >= '0' && ch <= '9'  ? (ch)+ " This is Digit" : (ch)+ " This is Special Character");
	}
}