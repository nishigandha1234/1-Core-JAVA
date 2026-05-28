/*21. Count Lowercase Letters Class Name: LowerCaseCount
void setString(String str)
int getLowerCaseCount()
Example Input: "JaVA" Output:1*/

class LowerCaseCount
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getLowerCaseCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'a' && ch <= 'z')
				count++;
		}
		return count;
	}
}
public class CountLowercaseLetters21
{
	public static void main(String x[])
	{
		LowerCaseCount uc = new LowerCaseCount();
		uc.setString("JaVA");
		System.out.println(uc.getLowerCaseCount());
	}
}