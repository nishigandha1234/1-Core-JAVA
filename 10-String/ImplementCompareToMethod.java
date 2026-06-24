/*72. Implement your own version of `String.compareTo()`.*/

class ImplementCompareToMethod
{
	public static void main(String x[])
	{
		String s1 = "Bat";	
		String s2 = "Cat";	
		int result = 0;
		int min = s1.length() < s2.length() ? s1.length() : s2.length();
		for(int i = 0 ; i < min ; i++)
		{
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			
			if(ch1 != ch2)
			{
				result = ch1-ch2;
				break;
			}
		}
		if(result == 0)
		{
			result = s1.length() - s2.length();
		}
		System.out.println(result);
	}
}