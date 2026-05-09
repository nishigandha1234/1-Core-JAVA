class FrequencyofEachCharacter
{
	public static void main(String x[])
	{
		String s = "banana";
		frequencyOfStr(s);
	}
	public static void frequencyOfStr(String s)
	{
		for(int i = 0; i < s.length() ; i++)
		{
			int count = 1;
			
			for(int j = i+1 ; j < s.length() ; j++)
			{
				if(s.charAt(i) == s.charAt(j))
				{
					count++;
				}
			}
			System.out.println(s.charAt(i) + " = " + count);
		}
	}	
}