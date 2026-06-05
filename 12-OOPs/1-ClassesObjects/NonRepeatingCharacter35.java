/*35. Find First Non-Repeating Character
Class Name: NonRepeatingCharacter
Methods:
void setString(String str)
char getFirstNonRepeating()
Example
Input:
 "aabbcdde"
Output:
 'c'
*/

class NonRepeatingCharacter
{
	private String s1; 
	private String s2; 
	
	void setStrings(String s1, String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
	}
	boolean isRotation()
	{
		String ans = "";
		if((s1+s1).contains(s2))
		{
			return true;
		}
		return false;
	}
}
public class NonRepeatingCharacter35
{
	public static void main(String x[])
	{
		NonRepeatingCharacter r1 = new NonRepeatingCharacter();
		r1.setStrings( "ABCD", "CDAB");
		System.out.println(r1.isRotation());
	}
}

