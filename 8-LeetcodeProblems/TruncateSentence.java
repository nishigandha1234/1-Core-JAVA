/*1816. Truncate Sentence
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.
Example 1: Input: s = "Hello how are you Contestant", k = 4 Output: "Hello how are you"*/

class TruncateSentence
{
	public static void main(String x[])
	{
		String s = "Hello how are you Contestant";
		int	k = 4
		int	k = 4;
		System.out.println(truncateSentence(s,k));		
	}
	public static String truncateSentence(String s, int k) 
	{
		String str[] = s.split(" ");
		
		String ans = "";
        for(int i = 0 ; i < k ; i++)
		{
			ans += str[i] + " ";
		}
		return ans;
    }
}