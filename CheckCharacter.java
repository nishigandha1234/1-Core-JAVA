import java.util.*;

public class CheckCharacter
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character  : ");
		char ch = sc.next().charAt(0); 
		
		if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')
		{
			System.out.println(ch +" is Alphabet.");
		}
		else if(ch >= '0' && ch <= '9') 
		{
			System.out.println(ch +" is Digit.");
		}
		else
		{
			System.out.println(ch +" is Sepcial Character.");
		}
	}
}