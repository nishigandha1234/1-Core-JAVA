/*5. Convert String to Uppercase
Create class UpperCaseConvert with methods:
void setString(String str) Stores string.
String getUpperCase() Converts lowercase letters into uppercase and returns result.
Example Input: "java" Output: "JAVA"*/

class UpperCaseConvert
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String getUpperCase()
	{
		String upper = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			upper += (char)(int)(ch - 32);
		}
		return upper;
	}
}
public class ConvertStringtoUppercase
{
	public static void main(String x[])
	{
		UpperCaseConvert rc = new UpperCaseConvert();
		rc.setString("java");
		System.out.println(rc.getUpperCase());
	}
}