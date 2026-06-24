/*80. Find all subsequences of a string.*/

class SubsequencesOfString
{
	public static void main(String x[])
	{
		subsequence("ABC", "", 0);
	}
	public static void subsequence(String s, String ans, int i)
	{
		if(i == s.length())
		{
			System.out.println(ans);
			return ;
		}
		subsequence(s, ans+s.charAt(i), i+1);
		subsequence(s, ans, i+1);
	}
}