/*6. Count the number of special characters in a string.*/

class CountSpeacialChar6
{	
	public static void main(String x[])
	{
		String word = "Nishi@1234";
		int count = 0;
		for(int i = 0 ; i < word.length() ; i++)
		{
			if(!(word.charAt(i) >= '0' && word.charAt(i) <= '9' 
				|| (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') 
				|| (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') 
			))
			{
				count++;
			}
		}
		System.out.println("Count of the Special Character is : "+count);
	}
}