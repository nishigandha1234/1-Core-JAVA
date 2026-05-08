/*459. Repeated Substring Pattern
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.
Example 1: Input: s = "abab" Output: true Explanation: It is the substring "ab" twice.*/

class RepeatedSubstringPattern
{
	public static void main(String x[])
	{
		String s = "abab";
		System.out.println(repeatedSubstringPattern(s));
	}
	public static boolean repeatedSubstringPattern(String s) 
	{
		String temp = s+s;
		
		temp = temp.substring(1, temp.length()-1);
		return temp.contains(s);
    }
}