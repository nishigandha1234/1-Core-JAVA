/*29. Convert First Letter Capital
Class Name: CapitalizeWord
Methods:
void setString(String str)
String capitalize()
Example
Input:
 "java programming"
Output:
 "Java Programming"
*/

class CapitalizeWord
{
	private String str; 
	private char ch; 
	
	void setString(String str)
	{
		this.str = str;
		this.ch = ch;
	}
	String capitalize()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if((i == 0 || str.charAt(i-1) == ' ') && (ch >= 'a' && ch <= 'z'))
				ch = (char)(ch-32);
			
			ans += ch;
		}
		return ans;
	}
}
public class ConvertFirstLetterCapital29
{
	public static void main(String x[])
	{
		CapitalizeWord r1 = new CapitalizeWord();
		r1.setString("java programming");
		System.out.println(r1.capitalize());
	}
}