/*345. Reverse Vowels of a String
Given a string s, reverse only all the vowels in the string and return it.The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
Example 1: Input: s = "IceCreAm" Output: "AceCreIm"*/

class ReverseVowelsOfString
{
	public static void main(String x[])
	{
		String s = "IceCreAm";
		System.out.println(reverseVowels(s));
	}
	public static String reverseVowels(String s) 
	{
		char[] c = s.toCharArray();
		
        for(int i = 0, j = c.length-1 ; i < j ; )
		{
			if( (c[i] == 'A' || c[i] == 'E' || c[i] == 'I' || c[i] == 'O' || c[i] == 'U' || c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') && (c[j] == 'A' || c[j] == 'E' || c[j] == 'I' || c[j] == 'O' || c[j] == 'U' || c[j] == 'a' || c[j] == 'e' || c[j] == 'i' || c[j] == 'o' || c[j] == 'u') )
			{
				char temp = c[i];
				c[i] = c[j];
				c[j] = temp;
				i++;
				j--;
			}
			else if(c[i] != 'A' && c[i] != 'E' && c[i] != 'I' && c[i] != 'O' && c[i] != 'U' && c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u')
			{
				i++;
			}
			else{
				j--;
			}
		}
		return new String(c);
    }
}