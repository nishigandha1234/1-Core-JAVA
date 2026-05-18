/*20. Find ASCII Value of Characters (No LeetCode) 
Given a character or string, print the ASCII value corresponding to each character. 
Example: Input: "A" → Output: 65*/

class FindASCIIValue
{
	public static void main(String s[])
	{
		String str = "A";
		System.out.println(findascii(str));
	}
	public static int findascii(String str)
	{
		int ascii = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			ascii = (int)(ch);
		}
		return ascii;
	}
}