/*87 Longest common prefix LC 14
14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.If there is no common prefix, return an empty string "".
Example 1: Input: strs = ["flower","flow","flight"] Output: "fl"*/

class LongestCommonPrefix87
{
	public static void main(String x[])
	{
		String [] str = {"flower","fly","flyover"};
		System.out.println(longestCommonPrefix(str));
	}
	public static String longestCommonPrefix(String[] str)
	{
		String prefix = str[0];
		for(int i =1 ; i < str.length ; i++)
		{
			while(str[i].indexOf(prefix) != 0)
			{
				prefix = prefix.substring(0, prefix.length()-1);
			}
		}
		return prefix;
	}
}