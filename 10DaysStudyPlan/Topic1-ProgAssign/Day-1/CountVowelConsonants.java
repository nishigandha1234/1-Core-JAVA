/*. Count Vowels and Consonants (No LeetCode) 
Given a string, count the total number of vowels and consonants present in it. Consider only 
alphabetic characters while performing the count. 
Example: Input: "apple" → Output: Vowels = 2, Consonants = 3*/

class CountVowelConsonants
{
	public static void main(String x[])
	{
		String s = "apple";
		countVowelsConsonants(s);
	}
	public static void countVowelsConsonants(String s)
	{	
		int vCount = 0, cCount = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' )
			{
				vCount++;
			}	
			else
			{
				cCount++;
			}
 		}
		System.out.println("Count of Vowel is : "+ vCount);
		System.out.println("Count of Consonants is : "+ cCount);
	}
}