/*16. Remove Duplicate Characters, Class Name: RemoveDuplicate
void setString(String str)
String removeDuplicateCharacters()
Description-Removes repeated characters from string.
Example - Input: "programming" Output: "progamin"*/

class RemoveDuplicate
{
	private String str;
	
	void setString(String str)
	{
		this.str = str;
	}
	String removeDuplicateCharacters()
	{
		int[] freq = new int[256];
		String ans = "";
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(freq[ch] == 0)
			{
				ans += ch;
				freq[ch]++;
			}
		}
		return ans;
	}
}
public class RemoveDuplicateCharacters16
{
	public static void main(String x[])
	{
		RemoveDuplicate s = new RemoveDuplicate();
		s.setString("programming");
		System.out.println(s.removeDuplicateCharacters());
	}
}