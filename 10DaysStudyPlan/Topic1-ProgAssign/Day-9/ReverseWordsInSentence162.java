/*9. Reverse Words in a Sentence
Input: I love Java  Output: Java love I*/

class ReverseWordsInSentence162
{
	public static void main(String x[])
	{
		String s = "I Love Java";
		System.out.println(reverse(s));
	}
	public static String reverse(String s)
	{
		String[] words = s.split(" ");
		String ans = "";
		for(int i = words.length-1 ; i >= 0 ; i--)
		{
			ans += words[i]+" ";
		}			
		return ans;	
	}
}