/*9. Compare Two Strings
Problem Statement-Create class CompareString with methods:
void setStrings(String s1, String s2) - Accepts two strings.
boolean isEqual()-Compares both strings and returns true if same.
Example Input: "java", "java" Output: true*/

class CompareString
{
	private String str1;
	private String str2;
	
	void setString(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
	}
	boolean isEqual()
	{
		if(str1.length() != str2.length())
			return false;
		
		for(int i = 0 ; i < str1.length() ; i++)
		{
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(ch1 != ch2)	
				return false;
		}
		return true;
	}
}
public class CompareTwoStrings9
{
	public static void main(String x[])
	{
		CompareString s = new CompareString();
		s.setString("java", "java" );
		System.out.println(s.isEqual());
	}
}