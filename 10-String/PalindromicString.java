
public class PalindromicString
{
	public static void main(String x[])
	{
		String s = "madam";
		palindromicString(s);
	}
	public static void palindromicString(String s)
	{
		String rev = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			rev += s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Palindromic String");
		}
		else
		{
			System.out.println("NOT Palindromic String");
		}
	}
}