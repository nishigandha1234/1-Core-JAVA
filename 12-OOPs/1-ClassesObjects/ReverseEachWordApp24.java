/*24. Reverse Each Word
Class Name: ReverseEachWord
Methods:
void setString(String str)
String reverseWords()
Example
Input:
 "Java Language"
Output:
 "avaJ egaugnaL"
*/

class ReverseEachWord
{
	private String str; 
	void setString(String str)
	{
		this.str = str;
	}
	String reverseWords()
	{
		String ans = "";
		String word = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
				word = ch + word;
			else
			{
				ans += word + " ";
				word = " ";
			}
		}
		ans += word;
		return ans;
	}
}
public class ReverseEachWordApp24
{
	public static void main(String x[])
	{
		ReverseEachWord r1 = new ReverseEachWord();
		r1.setString("Java Language");
		System.out.println(r1.reverseWords());
	}
}