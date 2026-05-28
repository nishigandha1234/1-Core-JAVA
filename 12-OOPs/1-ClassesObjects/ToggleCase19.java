/*19. Toggle Case - Class Name: ToggleCase
void setString(String str)
String toggle()
Description - Convert uppercase to lowercase and lowercase to uppercase.
Example Input: "JaVa" Output: "jAvA"*/

class ToggleCase
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	String toggle()
	{
		String toggle = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= 'a' && ch <= 'z')
				toggle += (char)(int)(ch-32);
			else if(ch >= 'A' && ch <= 'Z')
				toggle += (char)(int)(ch+32);
		}
		return toggle;
	}
}
public class ToggleCase19
{
	public static void main(String x[])
	{
		ToggleCase rc = new ToggleCase();
		rc.setString("JaVa");
		System.out.println(rc.toggle());
	}
}