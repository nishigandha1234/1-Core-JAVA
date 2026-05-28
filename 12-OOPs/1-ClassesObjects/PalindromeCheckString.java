/*4. Check Palindrome String
Problem Statement Create class PalindromeCheck with methods:
void setString(String str) Accepts string input.
boolean isPalindrome() Checks whether string is palindrome or not and returns true or false.
Example Input: "madam"
Output: true*/

class Palindrome
{
	private String str;

	void setString(String str)
	{
		this.str = str;
	}

	boolean isPalindrome() 
	{
		String rev = "";
		for(int i =  str.length()-1 ; i >= 0 ; i--)
		{
			char ch = str.charAt(i);
			rev += ch;
		}
		if(str.equals(rev))
			return true;
		else
			return false;
	}
}
public class PalindromeCheckString
{
	public static void main(String x[])
	{
		Palindrome rc = new Palindrome();
		rc.setString("madam");
		System.out.println(rc.isPalindrome());
	}
}