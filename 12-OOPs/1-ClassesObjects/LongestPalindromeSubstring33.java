/*33. Longest Palindrome Substring
Class Name: LongestPalindrome
Methods:
void setString(String str)
String getLongestPalindrome()
Example
Input:"babad"
Output:"bab" */

class LongestPalindrome
{
	private String str; 
	
	void setString(String str)
	{
		this.str = str;
	}
	String getLongestPalindrome()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			String s = "";
			for(int j = i ; j < str.length() ; j++)
			{
				s += str.charAt(j);
				
				String rev = "";
				for(int k = s.length()-1 ; k >= 0 ; k--)
				{
					rev += s.charAt(k);
				}
				if(s.equals(rev) && s.length() > ans.length())
				{
					ans = s;	
				}
			}
		}
		return ans;
	}
}
public class LongestPalindromeSubstring33
{
	public static void main(String x[])
	{
		LongestPalindrome r1 = new LongestPalindrome();
		r1.setString("babad");
		System.out.println(r1.getLongestPalindrome());
	}
}

