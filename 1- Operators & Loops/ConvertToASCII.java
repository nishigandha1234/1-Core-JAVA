import java.util.*;

class ConvertToASCII
{	
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to Convert into ASCII : ");
		char character = sc.next().charAt(0);
		
		int ch = character;
		System.out.println(ch);
	}
}