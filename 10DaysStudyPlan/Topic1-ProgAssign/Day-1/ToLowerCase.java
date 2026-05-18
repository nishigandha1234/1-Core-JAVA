/*709. To Lower Case
Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
Example 1: Input: s = "Hello" Output: "hello"*/

class ToLowerCase
{
	public static void main(String x[])
	{
		String s = "HEllo";
		System.out.println(toLowerCase(s));		
	}
	public static String toLowerCase(String s) 
	{
		String ans = "";
        for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				
				ans += (char)(ch+32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
    }
}