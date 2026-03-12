class NonRepeatingDigit
{
	public static void main(String x[])
	{
		String str = "Swiss";
		int count = 0;
		int i ;
		for(i = 0 ; i < str.length()-1; i++)
		{
			if(str.charAt(i) == str.charAt(i+1))
			{
				count++;
			}
		}
		if(count == 1)
		{
			System.out.println(str.charAt(i));
		}			
	}
}