/*26. Find Smallest Word
Class Name: SmallestWord
Methods:
void setString(String str)
String getSmallestWord()
Example
Input:
 "Java is easy"
Output:
 "is"*/
 
class SmallestWord
{
	private String str; 
	void setString(String str)
	{
		this.str = str;
	}
	String getSmallestWord()
	{
		String ans = "";
		String word = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch != ' ')
				word += ch;
			else
			{
				if(ans.equals("") || word.length() < ans.length())
					ans = word;
				word = "";
			}
		}
		if(ans.equals("") || word.length() < ans.length())
		{
			ans = word;
		}
		return ans;
	}
}
public class FindSmallestWord26
{
	public static void main(String x[])
	{
		SmallestWord r1 = new SmallestWord();
		r1.setString("Java is easy");
		System.out.println(r1.getSmallestWord());
	}
}