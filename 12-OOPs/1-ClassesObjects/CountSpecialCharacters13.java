/*13. Count Special Characters - Class Name: SpecialCharacterCount
void setString(String str)
int getSpecialCharacterCount()
Description - Counts symbols like @,#,$,%,&.
Example - Input: "Java@123#" - Output: 2*/

class SpecialCharacterCount
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getSpecialCharacterCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9' ||
			   ch >= 'a' && ch <= 'z' || 
			   ch >= 'A' && ch <= 'Z')		
				continue;
			else
				count++;
		}
		return count;
	}
}
public class CountSpecialCharacters13
{
	public static void main(String x[])
	{
		SpecialCharacterCount s = new SpecialCharacterCount();
		s.setString("Java@123#");
		System.out.println(s.getSpecialCharacterCount());
	}
}