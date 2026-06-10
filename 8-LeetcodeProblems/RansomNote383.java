/*383. Ransom Note
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.Each letter in magazine can only be used once in ransomNote.
Example 1: Input: ransomNote = "a", magazine = "b" Output: false*/

class RansomNote383
{
	public static void main(String x[])
	{
		String ransomNote = "aa", magazine = "aab";
		System.out.println(canConstruct(ransomNote, magazine));
	}
	public static boolean canConstruct(String ransomNote, String magazine) 
	{
		 int[] freq = new int[26];
		for(int i = 0 ; i < magazine.length() ; i++)
		{
			freq[magazine.charAt(i) - 'a']++;
		}
		for(int i = 0 ; i < ransomNote.length() ; i++)
		{
			freq[ransomNote.charAt(i) - 'a']--;
			if(freq[ransomNote.charAt(i) - 'a'] < 0)
				return false;
		}
		return true;
    }
}