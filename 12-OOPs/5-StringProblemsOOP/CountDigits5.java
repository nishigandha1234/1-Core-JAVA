/*5. Count the number of digits in a string.*/

class CountDigits5
{	
	public static void main(String x[])
	{
		String word = "Nishi@1234";
		int count = 0;
		for(int i = 0 ; i < word.length() ; i++)
		{
			if(word.charAt(i) >= '0' && word.charAt(i) <= '9')
			{
				count++;
			}
		}
		System.out.println("Count of the Digits is : "+count);
	}
}