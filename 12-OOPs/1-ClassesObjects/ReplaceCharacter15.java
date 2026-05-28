/*15. Replace Character - Class Name: ReplaceCharacter
void setData(String str, char oldCh, char newCh)
String replaceCharacter()
Description-Replace old character with new character.
Example Input:  "java", 'a', 'o' Output: "jovo"*/

class ReplaceCharacter
{
	private String str;
	private char oldCh;
	private char newCh;
	
	void setString(String str, char oldCh, char newCh)
	{
		this.str = str;
		this.oldCh = oldCh;
		this.newCh = newCh;
	}
	String replaceCharacter()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch == oldCh)
				ans += newCh;
			else
				ans += ch;
		}
		return ans;
	}
}
public class ReplaceCharacter15
{
	public static void main(String x[])
	{
		ReplaceCharacter s = new ReplaceCharacter();
		s.setString("java", 'a', 'o');
		System.out.println(s.replaceCharacter());
	}
}