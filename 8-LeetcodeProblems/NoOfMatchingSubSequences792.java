/*792. Number of Matching Subsequences
Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.For example, "ace" is a subsequence of "abcde".
Example 1:Input: s = "abcde", words = ["a","bb","acd","ace"] Output: 3
Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".*/

class NoOfMatchingSubSequences792
{
	public static void main(String x[])
	{
		String s = "abcde";
		String[] words = {"a","bb","acd","ace"};
		System.out.println(numMatchingSubseq(s, words));
	}
	public static int numMatchingSubseq(String s, String[] words) 
	{
		int count = 0;
		
        for(int i = 0 ; i < words.length ; i++)
		{
			String ch = words[i];
			int j = 0 , k = 0;
			
			while(j < ch.length() && k < s.length())
			{
				if(ch.charAt(j) == s.charAt(k))
					j++;
				k++;
			}
			if(j == ch.length())
				count++ ;
		}
		return count;
    }
}