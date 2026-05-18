/*5. Convert Lowercase to Uppercase (No LeetCode) 
Given a string containing lowercase letters, convert all characters into uppercase and return the 
updated string. 
Example: Input: "world" → Output: "WORLD" */

class ConvertLowercasetoUppercase
{
	public static void main(String x[])
	{
		String s = "hello";
		System.out.println(toUpperCase(s));
	}
	public static String toUpperCase(String s)
	{
		String ans = "";
        for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				
				ans += (char)(ch-32);
			}
			else
			{
				ans+=ch;
			}
		}
		return ans;
	}
}