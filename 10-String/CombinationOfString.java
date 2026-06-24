/*79. Find all combinations of characters in a string.*/

class CombinationOfString
{
	public static void main(String x[])
	{
		combination("ABC", "",0 , 2);
	}
	public static void combination(String s, String ans, int i, int r)
	{
		if(ans.length() == r)
		{
			System.out.println(ans);
			return ;
		}
		if(i == s.length())
			return ;
		
		combination(s, ans+s.charAt(i), i+1, r);
		combination(s, ans, i+1, r);
	}
}