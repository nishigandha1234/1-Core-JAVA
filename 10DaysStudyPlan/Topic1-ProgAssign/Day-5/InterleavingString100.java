/*100 Check valid shuffle of strings LC 97 
97. Interleaving String
Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...Note: a + b is the concatenation of strings a and b.
Example 1: Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac" Output: true*/

class InterleavingString100
{
	public static void main(String x[])
	{
		String s1 = "aabcc";
		String s2 = "dbbca";
		String s3 = "aadbbcbcac";

		if(s1.length() + s2.length() != s3.length())
		{
			System.out.println(false);
			return;
		}

		Boolean[][] dp =
		new Boolean[s1.length()+1][s2.length()+1];

		System.out.println(
		solve(s1, s2, s3, 0, 0, dp));
	}

	public static boolean solve(String s1,
	                            String s2,
	                            String s3,
	                            int i,
	                            int j,
	                            Boolean[][] dp)
	{
		// already solved
		if(dp[i][j] != null)
		{
			return dp[i][j];
		}

		// completed
		if(i + j == s3.length())
		{
			return true;
		}

		// take from s1
		if(i < s1.length() &&
		   s1.charAt(i) == s3.charAt(i+j))
		{
			if(solve(s1, s2, s3,
			         i+1, j, dp))
			{
				return dp[i][j] = true;
			}
		}

		// take from s2
		if(j < s2.length() &&
		   s2.charAt(j) == s3.charAt(i+j))
		{
			if(solve(s1, s2, s3,
			         i, j+1, dp))
			{
				return dp[i][j] = true;
			}
		}

		return dp[i][j] = false;
	}
}