/*28. Remove Particular Character
Class Name: RemoveCharacter
Methods:
void setData(String str, char ch)
String removeCharacter()
Example
Input:
 "banana", 'a'
Output:
 "bnn"*/
 
class RemoveCharacter
{
	private String str; 
	private char ch; 
	
	void setData(String str, char ch)
	{
		this.str = str;
		this.ch = ch;
	}
	String removeCharacter()
	{
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char chr = str.charAt(i);
			
			if (ch != chr)
			{
				ans += chr;
			}
		}
		return ans;
	}
}
public class RemoveParticularCharacter28
{
	public static void main(String x[])
	{
		RemoveCharacter r1 = new RemoveCharacter();
		r1.setData("banana", 'a');
		System.out.println(r1.removeCharacter());
	}
}