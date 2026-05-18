/*11. First Unique Character / Character Frequency (LC 387 Inspired) 
Given a string, count the frequency of each character and display how many times every 
character appears in the string. 
Example: Input: "banana" → Output: b=1, a=3, n=2*/

class FirstUniqueCharacter
{
	public static void main(String x[])
	{
		String s = "banana";
		uniqueCharacter(s);
	}
	public static void uniqueCharacter(String s)
	{
		int[] freq = new int[256];
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			freq[ch]++;
		}
		for(int i = 0; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(freq[ch] != 0)
			{
				System.out.print(ch + "=" + freq[ch]+ ", ");
				freq[ch] = 0;
			}
		}
	}
} 