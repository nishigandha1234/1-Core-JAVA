/*Example: Create class name as UpperCase with following methods 
void setString(String data): this method is used for accept string as parameter 
String getUpperCase(): this method can convert your lower case string to upper case and return it.*/

class UppercaseMethod
{
	private String str;
	
	void setString(String data)
	{
		str = data;
	}
	String getUpperCase()
	{
		String ans = "";
		char ch= ' ';
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
				ch = (char)((int)(str.charAt(i)-32));
			ans += ch;
		}
		return ans;
	}
}
public class UpperCaseApp
{	
	public static void main(String x[])
	{	
		UppercaseMethod u = new UppercaseMethod();
		u.setString("abcde");
		String result=u.getUpperCase();
		System.out.println(result);
	}
}