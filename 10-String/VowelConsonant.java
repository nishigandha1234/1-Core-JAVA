
class VowelConsonant
{
	public static void main(String x[])
	{
		String name = "Omkar
		String name = "Omkar";
		if(isString(name))
		{
			System.out.println(name);
        }
        else
        {
            System.out.println("Invalid");
        }
	}
	public static boolean isString(String name)
	{
		int count = 0;
		for(int i = 0 ; i < name.length() ; i++)
		{
			if(isVowel(name.charAt(i)))
			{
				count++;
			}
		}
		if(count >= 2 && isVowel(name.charAt(0)) && (!isVowel(name.charAt(name.length()-1))))
		{
			return true;
		}
		else{
			return false;
		}
			
	}
	public static boolean isVowel(char ch)
	{
		return ch == 'A' || ch == 'E' || ch == 'O' || ch == 'I' || ch == 'U' ||
			ch == 'a' || ch == 'e' || ch == 'u' || ch == 'i' || ch == 'o';
	}
}