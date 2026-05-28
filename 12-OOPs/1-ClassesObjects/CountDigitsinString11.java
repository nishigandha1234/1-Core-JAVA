/*1. Count Digits in String - Class Name: DigitCount
void setString(String str)
int getDigitCount()
Description-Count total numeric digits present in string.
Example Input: "Java123" Output: 3*/

class DigitCount
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getDigitCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9')
				count++;
		}
		return count;
	}
}
public class CountDigitsinString11
{
	public static void main(String x[])
	{
		DigitCount s = new DigitCount();
		s.setString("Java123");
		System.out.println(s.getDigitCount());
	}
}