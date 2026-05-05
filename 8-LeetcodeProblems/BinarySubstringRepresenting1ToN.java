/*1016. Binary String With Substrings Representing 1 To N
Given a binary string s and a positive integer n, return true if the binary representation of all the integers in the range [1, n] are substrings of s, or false otherwise.A substring is a contiguous sequence of characters within a string.
Example 1: Input: s = "0110", n = 3 Output: true */

class BinarySubstringRepresenting1ToN
{
	public static void main(String x[])
	{
		String s = "0110";
		int	n = 3;
		System.out.println(queryString(s,n));
		//queryString(s,n);
	}
	public static boolean queryString(String s, int n) 
	{
		for(int i = 1 ; i <= n ; i++)
		{
			String num = Intege
			String num = Integer.toBinaryString(i);
        
			if(!s.contains(num))
			{
				return false;
			}
		}
		return true;
    }
}