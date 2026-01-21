import java.util.*;

public class VowelConsonant
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character : ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
		{
			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				System.out.println((ch)+"Vowel");
			}
			else{
				System.out.println((ch)+"Consonant");
			}
		}
		else{
			System.out.println((ch)+"Not a Alphabet");
		}
	}
}