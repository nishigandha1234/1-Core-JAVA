/*18. Check Anagram String - Class Name: AnagramCheck
void setStrings(String s1, String s2)
boolean isAnagram()
Description - Checks whether both strings contain same characters.
Example Input: "listen", "silent" Output: true*/
 
 class AnagramCheck
{
	private String str1;
	private String str2;
	
	void setString(String str1, String str2)
	{
		this.str1 = str1;
		this.str2 = str2;
	}
	boolean isAnagram()
	{
		if(str1.length() != str2.length())
			return false;
		int freq[] = new int[256];
		
		for(int i = 0 ; i < str1.length() ; i++)
		{
			freq[str1.charAt(i)]++;
			freq[str2.charAt(i)]--;
		}
		boolean flag = true;;
		for(int i = 0 ; i < freq.length ; i++)
		{
			if(freq[i] != 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
}
public class CheckAnagramString18
{
	public static void main(String x[])
	{
		AnagramCheck s = new AnagramCheck();
		s.setString("listen", "silent");
		System.out.println(s.isAnagram());
	}
}