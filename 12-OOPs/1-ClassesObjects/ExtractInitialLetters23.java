/*23. Extract Initial Letters
Class Name: InitialExtractor
void setString(String str)
String getInitials()
Example Input: "Central Processing Unit" Output: "CPU"*/

class InitialExtractor
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String getInitials()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(i == 0 || str.charAt(i-1) == ' ')
			{
				ans += ch;
			}
		}
		return ans;
	}
}
public class ExtractInitialLetters23
{
	public static void main(String x[])
	{
		InitialExtractor uc = new InitialExtractor();
		uc.setString("Central Processing Unit");
		System.out.println(uc.getInitials());
	}
}