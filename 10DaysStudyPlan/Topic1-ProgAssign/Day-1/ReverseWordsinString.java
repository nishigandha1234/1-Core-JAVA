/*557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Example 1:Input: s = "Let's take LeetCode contest" Output: "s'teL ekat edoCteeL tsetnoc"*/

class ReverseWordsinString
{
	public static void main(String x[])
	{
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
	public static String reverseWords(String s) 
	{
		String ans = "";
		String word = "";
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			
			if(ch != ' ')
			{
				word += ch;
			}
			else
			{
				for(int j = word.length()-1 ; j >= 0 ; j--)
				{
					ans += word.charAt(j);
				}
				ans += " ";
				word = "";
			}
		}	
		for(int i = word.length()-1 ; i >= 0 ; i--)
		{
			ans += word.charAt(i);
		}
		return ans;
	}
}