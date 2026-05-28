/*7. Find Length of String
Problem Statement-Create class StringLength with methods:
void setString(String str) Stores string.
int getLength() Returns total number of characters in string.
Example Input: "Programming" Output: 11*/

class StringLength
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getLength()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
			count++;
		return count;
	}
}
public class FindLengthofString
{
	public static void main(String x[])
	{
		StringLength s = new StringLength();
		s.setString("Developer");
		System.out.println(s.getLength());
	}
}