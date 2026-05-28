/*10. Find First Character
Problem Statement-Create class FirstCharacter with methods:
void setString(String str) Stores string.
char getFirstCharacter() Returns first character from string.
Example
Input: "Computer" Output: 'C'*/

class FirstCharacter
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	char getFirstCharacter()
	{
		char ch = ' ';
		for(int i = 0 ; i < str.length() ; i++)
		{
			ch = str.charAt(i);
			break;
		}
		return ch;
	}
}
public class FindFirstCharacter10
{
	public static void main(String x[])
	{
		FirstCharacter s = new FirstCharacter();
		s.setString("Computer");
		System.out.println(s.getFirstCharacter());
	}
}