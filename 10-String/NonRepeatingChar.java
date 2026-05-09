class NonRepeatingChar
{
	public static void main(String x[])
	{
		String s = "aabbcddee";
		nonRepeatingChar(s);
	}
	public static void nonRepeatingChar(String s)
	{
		for(int i = 0 ; i < s.length() ; i++)
		{
			int count = 0;
			for(int j = 0 ; j < s.length() ; j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			if(count == 1)
			{
				System.out.println(s.charAt(i));
				break;
			}
		}
	}	
}