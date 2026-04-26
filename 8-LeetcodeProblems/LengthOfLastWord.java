/*58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
Example 1: Input: s = "Hello World" Output: 5
Explanation: The last word is "World" with length 5.*/

class LengthOfLastWord
{
	public static void main(String x[])
	{
		String s = "   fly me   to   the moon  ";
		System.out.println(lengthOfLastWord(s));
	}
	public static int lengthOfLastWord(String s) 
	{
        s = s.trim();
		int count= 0;
		
		for(int i = s.length()-1 ; i >= 0 ;i--)
		{
			if(s.charAt(i) != ' ')
			{
				count++;
			}
			else
			{
				break;
			}
		}
		return count;
    }
}
