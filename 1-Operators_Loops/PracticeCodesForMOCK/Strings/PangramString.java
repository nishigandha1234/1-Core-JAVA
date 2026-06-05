import java.util.Scanner;

class PangramString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :" );
		String s = sc.nextLine();
		
		boolean[] seen = new boolean[26];
		
		for(int i = 0 ; i < 26 ; i++)
		{
			char ch = s.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z')
			{
				ch = (char)(ch+32);
			}
			
			if(ch >= 'a' && ch <= 'z')
			{
				seen[ch - 'a'] = true;
			}
		}
		boolean flag = true;
		
		for(int i = 0 ; i < 26 ; i ++)
		{
			if(!seen[i])
			{
				flag = false;
				break;
			}
		}
		
		if(flag) System.out.println("Pangram");
		else System.out.println("NOT Pangram");
	}
}