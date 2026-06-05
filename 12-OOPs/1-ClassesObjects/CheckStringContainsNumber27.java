/*27. Check String Contains Number
Class Name: ContainsNumber
Methods:
void setString(String str)
boolean hasNumber()
Example
Input:
 "Java123"
Output:
 true
*/

class ContainsNumber
{
	private String str; 
	void setString(String str)
	{
		this.str = str;
	}
	boolean hasNumber()
	{
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9')
			{
				return true;
			}
		}
		return false;
	}
}
public class CheckStringContainsNumber27
{
	public static void main(String x[])
	{
		ContainsNumber r1 = new ContainsNumber();
		r1.setString("Java123");
		System.out.println(r1.hasNumber());
	}
}