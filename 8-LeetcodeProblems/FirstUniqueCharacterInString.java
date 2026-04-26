/*387. First Unique Character in a String
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
Example 1: Input: s = "leetcode" Output: 0*/

class FirstUniqueCharacterInString
{
	public static void main(String x[])
	{
		String s = "loveleetcode";
		System.out.println(firstUniqChar(s));
	}
	public static int firstUniqChar(String s) 
    {
        for(int i = 0 ; i < s.length() ; i++)
		{
			int count = 0 ;
			for(int j = 0 ; j < s.length() ; j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println(s.charAt(i) + " " + count);
				return i;
			}
		}
        return -1;
    }
}