/*3121. Count the Number of Special Characters II
You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.Return the number of special letters in word.
Example 1:Input: word = "aaAbcBC" Output: 3*/

class CountSpecialCharacter3121
{
	public static void main(String x[])
	{
		String word = "aaAbcBC";
		System.out.println(numberOfSpecialChars(word));
	}
	public static int numberOfSpecialChars(String word) 
	{
		int[] upper = new int[26];
		int[] lower = new int[26]; 
		int	count = 0;
		
		for(int i = 0 ; i < 26 ; i++)
		{
			lower[i] = -1;
			upper[i] = -1;
		}
		
        for(int i = 0 ; i < word.length() ; i++)
		{
			char ch = word.charAt(i);
			if(ch >= 'a' && ch <= 'z')
			{
				lower[ch-'a'] = i;
			}
			if(ch >= 'A' && ch <= 'Z')
			{
				if(upper[ch-'A'] == -1)
					upper[ch-'A'] = i;
			}
		}
		
		for(int i = 0 ; i < 26 ; i++)
		{
			if(lower[i] != -1 && upper[i] != -1 && lower[i] < upper[i])
			{
				count++;
			}
		}
		return count;
    }
}
