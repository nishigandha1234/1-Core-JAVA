/*434. Number of Segments in a String
Given a string s, return the number of segments in the string.
A segment is defined to be a contiguous sequence of non-space characters.
Example 1: Input: s = "Hello, my name is John" Output: 5*/

class NumofSegmentsinString
{
	public static void main(String x[])
	{
		String s = "";
		System.out.println(countSegments(s));
	}
	public static int countSegments(String s) 
	{
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) != ' ' && ( i ==0 || s.charAt(i-1) == ' '))
			{
				count++;
			}
		}
		return count;
	}
}