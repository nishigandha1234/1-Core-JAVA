/*3. Count the number of vowels in a string.*/

class CountVowels3
{	
	public static void main(String x[])
	{
		String word = "Nishigandha";
		int count = 0;
		for(int i = 0 ; i < word.length() ; i++)
		{
			if(word.charAt(i) == 'A' || word.charAt(i) == 'E' || word.charAt(i) == 'I' || word.charAt(i) == 'O' || word.charAt(i) == 'U' || word.charAt(i) == 'a' ||word.charAt(i) == 'e' ||word.charAt(i) == 'i' ||word.charAt(i) == 'o' ||word.charAt(i) == 'u')
			{
				count++;
			}
		}
		System.out.println("Count of the Vowel is : "+count);
	}
}