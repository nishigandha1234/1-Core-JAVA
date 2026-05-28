/*3. Reverse String
Problem StatementCreate class ReverseString with methods:
void setString(String str) Stores string into variable.
String getReverse() Returns reverse of string.
Example Input: "Java"
Output: "avaJ"*/

class Reverse
{
	private String str;

	void setString(String str)
	{
		this.str = str;
	}

	String getReverse()
	{
		String rev = "";
		for(int i =  str.length()-1 ; i >= 0 ; i--)
		{
			char ch = str.charAt(i);
			rev += ch;
		}
		return rev;
	}
}
public class ReverseString
{
	public static void main(String x[])
	{
		Reverse rc = new Reverse();
		rc.setString("Java");
		System.out.println(rc.getReverse());
	}
}