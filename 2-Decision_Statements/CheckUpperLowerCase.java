import java.util.Scanner;

public class CheckUpperLowerCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);
		
		if(ch >= 'A' && ch <= 'Z')
		{
			System.out.println("Character is Upper Case");
		}
		else if(ch >= 'a' && ch <= 'z')
		{
			System.out.println("Character is Lower Case");
		}
		else{
			System.out.println("Its not Character");
		}
	}
}