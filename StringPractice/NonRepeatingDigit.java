class NonRepeatingDigit
{
	public static void main(String x[])
	{
		String str = "Swiss";
		int count = 0;
		int i ;
		for(i = 0 ; i < str.length()-1; i++)
		{
			for(int j = 0 ; j < str.length() ; j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
		}
		//System.out.println(str.charAt(i) + " : " + count);
		if(count == 1)
		{
			System.out.println(str.charAt(i));
			break;
		}			
	}
}