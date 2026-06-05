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
	private String str; 
	
	void setString(String str)
	{
		this.str = str;
	}
	char getFirstNonRepeating()
	{
		int count = 1;
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			for(int j = i+1 ; j < str.length() ; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
		}
		return '/0';
	}
}
public class NonRepeatingCharacter35
{
	public static void main(String x[])
	{
		NonRepeatingCharacter r1 = new NonRepe
		NonRepeatingCharacter r1 = new NonRepeatingCharacter();
		r1.setStrings("aabbcdde");
		System.out.println(r1.getFirstNonRepeating());
	}
}

