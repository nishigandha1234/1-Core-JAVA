/*25. Find Longest Word
Class Name: LongestWord
Methods:
void setString(String str)
String getLongestWord()
Example
Input:
 "Java is powerful"
Output:
 "powerful"
*/

class LongestWord
{
	private String str; 
	void setString(String str)
	{
		this.str = str;
	}
	String getLongestWord()
	{
		String ans = "";
		String word = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
			{
				word += ch;
			}
			else
			{
				if(word.length() > ans.length())
				{
					ans = word;
				}					
				word = "";
			}	
		}
		if(word.length() > ans.length())
		{
			ans = word;
		}
		return ans;
	}
}
public class FindLongestWord25
{
	public static void main(String x[])
	{
		LongestWord r1 = new LongestWord();
		r1.setString("Java is powerful");
		System.out.println(r1.getLongestWord());
	}
}