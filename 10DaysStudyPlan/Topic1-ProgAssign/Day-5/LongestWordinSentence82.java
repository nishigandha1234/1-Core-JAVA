/*82 Longest word in sentence LC 720 
720. Longest Word in Dictionary
Given an array of strings words representing an English Dictionary, return the longest word in words that can be built one character at a time by other words in words.If there is more than one possible answer, return the longest word with the smallest lexicographical order. If there is no answer, return the empty string.
Example 1:Input: words = ["w","wo","wor","worl","world"] Output: "world"*/

class LongestWordinSentence82
{
	public static void main(String x[])
	{
		String[] words = {"w","wo","wor","worl","world"};
		System.out.println(longestWord(words));
	}
	public static String longestWord(String[] words) 
	{
		String ans = "";
        for(int i = 0 ; i < words.length ; i++)
		{
			String word = words[i];
			boolean flag = true;
			for(int j = 1 ; j < word.length() ; j++)
			{
				String prefix = word.substring(0, j);
				boolean found = false;
				for(int k = 0 ; k < words.length ; k++)
				{
					if(words[k].equals(prefix))
					{
						found = true;
						break;
					}
				}
				if(found == false){
					flag = false;
					break;
				}
			}
			if(flag)
			{
				if(word.length() > ans.length())
				{
					ans = word;
				}
				else if(word.length() == ans.length()
                        && word.compareTo(ans) < 0)
                {
                    ans = word;
                }
			}
		}
		return ans;
    }
}