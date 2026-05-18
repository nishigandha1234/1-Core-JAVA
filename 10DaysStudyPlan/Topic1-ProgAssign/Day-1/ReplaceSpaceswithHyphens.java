/*12. Replace Spaces with Hyphens (LC 1592 Inspired) 
Given a string containing spaces, replace every space character with a hyphen (-) and return the 
modified string. 
Example: Input: "hello world" → Output: "hello-world" */

class ReplaceSpaceswithHyphens
{
	public static void main(String x[])
	{
		String s = "hello world";
		System.out.println(replacehyphen(s));
	}
	public static String replacehyphen(String s)
	{
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch != ' ')
			{
				ans += ch;
			}
			else
			{
				ans+= "-";
			}
		}
		return ans;
	}
} 