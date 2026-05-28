/*12. Remove Spaces from String - Class Name: RemoveSpaces
void setString(String str)
String removeSpace()
Description - Remove all spaces from string.
Example Input: "Java Programming" Output: "JavaProgramming"*/

class RemoveSpaces
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String removeSpace()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ')
				ans += ch;
		}
		return ans;
	}
}
public class RemoveSpacesfromString12
{
	public static void main(String x[])
	{
		RemoveSpaces s = new RemoveSpaces();
		s.setString("Java Programming");
		System.out.println(s.removeSpace());
	}
}