/*14. Find Frequency of Character - Class Name: CharacterFrequency
void setData(String str, char ch) , int getFrequency()
Description - Count how many times a character appears.
Example Input: "banana", 'a' Output: 3 */

class CharacterFrequency
{
	private String str;
	private char ch;
	
	void setString(String str, char ch)
	{
		this.str = str;
		this.ch = ch;
	}
	int getFrequency()
	{
		int[] freq = new int[256];
		for(int i = 0 ; i < str.length() ; i++)
		{
			freq[str.charAt(i)]++;
		}
		return freq[ch];
		
		/*or
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == ch)
				count++;
		}
		return count;*/
	}
}
public class FindFrequencyofCharacter14
{
	public static void main(String x[])
	{
		CharacterFrequency s = new CharacterFrequency();
		s.setString("banana", 'a');
		System.out.println(s.getFrequency());
	}
}