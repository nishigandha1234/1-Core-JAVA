/*71. Implement your own version of `String.equals()`.*/

class ImplementEqualsMethod
{
	public static void main(String x[])
	{
		String s1 = "Eat";	
		String s2 = "Eat";	
		boolean flag = true;
		
		if(s1.length() != s2.length())
			flag = false;
		else
		{
			for(int i = 0 ; i < s1.length() ; i++)
			{
				if(s1.charAt(i) != s2.charAt(i))
					flag = false;
			}
		}
		if(flag) System.out.println("Strings are Equal");
		else System.out.println("Strings are NOT Equal");
	}
}