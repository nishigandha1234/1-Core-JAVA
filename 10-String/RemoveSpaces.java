class RemoveSpaces
{
	public static void main(String x[])
	{
		String s =  "hello world java";
		System.out.println(removeSpaces(s));
	}
	public static String removeSpaces(String s)
	{
		String ans = "";
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(s.charAt(i) != ' ')
			{
				ans += s.charAt(i);
			}
		}
		return ans;
	}

}