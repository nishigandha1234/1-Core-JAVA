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
		for(int i = 0 ; i < str.le
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = ' ';
		}
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