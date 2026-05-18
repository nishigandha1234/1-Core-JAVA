/*18. Toggle Case of Characters (No LeetCode) 
Given a string, change all uppercase letters to lowercase and all lowercase letters to uppercase. 
Return the transformed string. 
Example: Input: "HeLLo" → Output: "hEllO" */

class ToggleCaseofCharacters
{
	public static void main(String x[])
	{
		String s = "HeLLo";
		toggleCase(s);
	}
	public static void toggleCase(String s)
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
				ans += (char)(ch-32);
			}
		}
		System.out.println(ans);
	}
}