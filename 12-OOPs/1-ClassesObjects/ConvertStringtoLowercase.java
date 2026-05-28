/*6. Convert String to Lowercase
Create class LowerCaseConvert with methods:
void setString(String str) Accepts string.
String getLowerCase() Converts uppercase letters into lowercase.
Example Input: "JAVA" Output: "java"*/

class LowerCaseConvert
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String getLowerCase()
	{
		String lower = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			lower += (char)(int)(ch+32);
		}
		return lower;
	}
}
public class ConvertStringtoLowercase
{
	public static void main(String x[])
	{
		LowerCaseConvert rc = new LowerCaseConvert();
		rc.setString("JAVA");
		System.out.println(rc.getLowerCase());
	}
}