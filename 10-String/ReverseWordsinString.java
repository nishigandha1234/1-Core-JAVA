/*151. Reverse Words in a String
Given an input string s, reverse the order of the words.Return a string of the words in reverse order concatenated by a single space.Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
Example 1:
Input: s = "the sky is blue"
Output: "blue is sky the"*/

class ReverseWordsinString
{
	public static void main(String x[])
	{
		String s = "the sky is blue";
		System.out.println(reverseWords(s));		
	}
	public static String reverseWords(String s) 
	{
		String[] str = s.split(" ");
		String rev = "";
		
		for(int i =
		for(int i = str.length-1 ; i >= 0 ; i--)
		{
			rev += str[i];
			
			if(i != 0)
				rev += " ";
		}
		return rev.trim();
    }
}
