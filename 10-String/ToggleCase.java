import java.util.Scanner;

class ToggleCase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <= 'Z') //upper to lower +32
			{
				ans += (char)(ch+32);
			}
			else if(ch >= 'a' && ch <= 'z') //lower to upper -32
			{
				ans += (char)(ch-32);
			}
		}
		System.out.println(ans);
	}
}