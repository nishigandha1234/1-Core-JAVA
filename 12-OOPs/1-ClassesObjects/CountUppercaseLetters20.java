/*20. Count Uppercase Letters - Class Name: UpperCaseCount
void setString(String str)
int getUpperCaseCount()
Example Input:"JaVA" Output: 3*/

class UpperCaseCount
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getUpperCaseCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
				count++;
		}
		return count;
	}
}
public class CountUppercaseLetters20
{
	public static void main(String x[])
	{
		UpperCaseCount uc = new UpperCaseCount();
		uc.setString("JaVA");
		System.out.println(uc.getUpperCaseCount());
	}
}