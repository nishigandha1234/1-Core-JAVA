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
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < str.length() ; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				return str.charAt(i);
			}
		}
		return '0';
	}
}
public class NonRepeatingCharacter35
{
	public static void main(String x[])
	{
		NonRepeatingCharacter r1 = new NonRepeatingCharacter();
		r1.setString("aabbcdde");
		System.out.println(r1.getFirstNonRepeating());
	}
}

