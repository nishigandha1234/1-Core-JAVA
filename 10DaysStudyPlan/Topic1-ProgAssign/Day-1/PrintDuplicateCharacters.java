/*13. Print Duplicate Characters (No LeetCode) 
Given a string, identify and print all characters that occur more than once in the string. Each 
duplicate character should be printed only once. 
Example: Input: "programming" → Output: "r g m"*/

class PrintDuplicateCharacters
{
	public static void main(String x[])
	{
		String s = "banana";
		duplicateChar(s);
	}
	public static void duplicateChar(String s)
	{
		String ans = "";
		for(int i = 0 ; i < s.length()-1 ; i++)
		{
			for(int j = i+1 ; j < s.length() ; j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					if(ans.indexOf(s.charAt(i)) == -1)
						ans += s.charAt(i) + " ";
					break;
				}
			}
		}
		System.out.println(ans);
	}
}