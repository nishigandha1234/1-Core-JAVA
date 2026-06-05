/*32. Generate All Substrings
Class Name: SubstringGenerator
Methods:
void setString(String str)
void generateSubstring()
Description
Generate every possible substring.
Example
Input:
 "abc"
Output:
 a, b, c, ab, bc, abc*/
 
class SubstringGenerator
{
	private String str; 
	
	void setString(String str)
	{
		this.str = str;
	}
	void generateSubstring()
	{
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			String s = "";
			for(int j = i ; j < str.length() ; j++)
			{
				s += str.charAt(j);
				System.out.print(s+" ");
			}
		}
	}
}
public class GenerateAllSubstrings32
{
	public static void main(String x[])
	{
		SubstringGenerator r1 = new SubstringGenerator();
		r1.setString("abc");
		r1.generateSubstring();
	}
}

