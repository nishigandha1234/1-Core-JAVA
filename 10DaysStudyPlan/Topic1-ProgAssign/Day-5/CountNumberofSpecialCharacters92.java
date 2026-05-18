/*3120. Count the Number of Special Characters 
You are given a string word. A letter is called special if it appears both in lowercase and uppercase in word.Return the number of special letters in word.
Example 1: Input: word = "aaAbcBC" Output: 3
Explanation: The special characters in word are 'a', 'b', and 'c'.*/

class CountNumberofSpecialCharacters92
{
	public static void main(String x[])
	{
		String word = "aaAbcBC" ;
		System.out.println(numberOfSpecialChars(word));
	}
	public static int numberOfSpecialChars(String word) 
	{
        int count = 0 ;
		for(char ch = 'a'; ch <= 'z' ; ch++)
		{
			boolean small = false;
			boolean capital = false;
			
			for(int i = 0 ; i < word.length() ; i++)
			{
				if(word.charAt(i) == ch)
					small = true;
				if(word.charAt(i) == Character.toUpperCase(ch))
					capital = true;
			}
			if(small && capital)
				count++;
		}
		return count;
    }	
}