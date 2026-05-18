/*8. Remove Spaces from String (LC 1592 Inspired) 
Given a string containing spaces, remove all spaces and return the updated string without 
changing the order of remaining characters. 
Example: Input: "a b c d" → Output: "abcd" */

class RemoveSpacesfromString
{
	public static void main(String s[])
	{
		String str = "a b c d";
		System.out.println(removeSpace(str));
	}
	public static String removeSpace(String str)
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
			{
				ans += ch;
			}
		}
		return ans;
	}
}
