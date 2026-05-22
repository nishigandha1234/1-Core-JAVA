/*6. Remove Duplicate Characters ⭐⭐⭐⭐
Input:programming Output: progamin*/

class RemoveDuplicateCharacters165
{
	public static void main(String x[])
	{
		String s = "Programming";
		System.out.println(removeDup(s));
	}
	public static String removeDup(String s)
	{
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j < i ; j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					flag = true;
					break;
				}
			}
			if(!flag)
				ans += s.charAt(i);
		}
		return ans;
	}
}