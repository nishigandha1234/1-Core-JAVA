import java.util.Scanner;

public class VowelsCharacterValidation
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		System.out.println(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ? (ch)+ " Vowel" : (ch)+ " This is NOT Vowel");
	}
}