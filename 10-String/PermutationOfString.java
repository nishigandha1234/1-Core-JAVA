/*78. Find all permutations of a string.*/

class PermutationOfString
{
	public static void main(String x[])
	{
		premutation("ABC", "");
	}
	public static void premutation(String s, String ans)
	{
		if(s.length() == 0)
		{
			System.ou
			System.out.println(ans);
			return ;
		}
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			String remaining = s.substring(0, i) + s.substring(i+1);
			premutation(remaining, ans+ch);
		}
	}
}