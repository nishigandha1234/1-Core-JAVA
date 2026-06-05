/*34. Check Rotational String
Class Name: RotationCheck
Methods:
void setStrings(String s1, String s2)
boolean isRotation()
Example
Input:
 "ABCD", "CDAB"
Output:
 true
*/

class RotationCheck
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
public class CheckRotationalString34
{
	public static void main(String x[])
	{
		RotationCheck r1 = new RotationCheck();
		r1.setStrings( "ABCD", "CDAB");
		System.out.println(r1.isRotation());
	}
}

