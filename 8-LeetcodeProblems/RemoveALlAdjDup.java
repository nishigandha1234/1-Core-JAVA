//1047. Remove All Adjacent Duplicates In String
//You are given a string s consisting of lowercase English letters. A duplicate removal consists of choosing two adjacent and equal letters and removing them. We repeatedly make duplicate removals on s until we no longer can. Return the final string after all such duplicate removals have been made. It can be proven that the answer is unique.

class RemoveALlAdjDup
{
	public static void main(String x[])
	{
		String s = "abbaca";
		System.out.println(removeDuplicates(s));
	}
	public static String removeDuplicates(String s) 
	{
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			int n = sb.length();
			
			if(n > 0 && sb.charAt(n-1) == ch)
			{
				sb.deleteCharAt(n-1);
			}
			else
			{
				sb.append(ch);
			}
		}
		return sb.
		return sb.toString();
	}
}