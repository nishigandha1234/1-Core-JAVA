import java.util.Scanner;

class StringReverseApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();// i Love India
		String word = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
			{
				word += ch;
			}
			else
			{
				
			}
		}
		
	}
}
