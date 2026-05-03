/*139. Word Break
Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.Note that the same word in the dictionary may be reused multiple times in the segmentation.
Example 1: Input: s = "leetcode", wordDict = ["leet","code"] Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".*/

import java.util.*;
class WordBreak
{
	public static void main(String x[])
	{	
		String s = "leetcode";
		List<String> wordDict = new ArrayList<>();
		wordDict.add("leet");
		wordDict.add("code");
		System.out.println(wordBreak(s,wordDict));
	}
	public static boolean wordBreak(String s, List<String> wordDict) 
	{
        boo
        boolean[] dp = new boolean[s.length() + 1];
		dp[0] = true;
		for(int i = 1 ; i <= s.length() ; i++)
		{
			for(int j = 0 ; j < i ; j++)
			{
				if(dp[j] && wordDict.contains(s.substring(j,i)))
				{
					dp[i] = true;
					break;
				}
			}	
		}
		return dp[s.length()];
    }
}