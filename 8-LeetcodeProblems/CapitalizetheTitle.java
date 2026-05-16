/*2129. Capitalize the Title
You are given a string title consisting of one or more words separated by a single space, where each word consists of English letters. Capitalize the string by changing the capitalization of each word such that: If the length of the word is 1 or 2 letters, change all letters to lowercase.Otherwise, change the first letter to uppercase and the remaining letters to lowercase.
Return the capitalized title.
Example 1: Input: title = "capiTalIze tHe titLe" Output: "Capitalize The Title"*/

class CapitalizetheTitle
{
	public static void main(String x[])
	{
		String title = "hElLO nisHiGANdHa kAKAdE";
		System.out.println(capitalizeTitle(title));
	}
	public static String capitalizeTitle(String title) 
	{
		title = title.toLowerCase();
		String[] words = title.split(" ");
		String ans = "";
		for(int i = 0 ; i < words.length ; i++)
		{
			String ch = words[i];
			if(ch.length() > 2)
			{
				char letter = Character.toUpperCase(ch.charAt(0));
				ch = letter + ch.substring(1);
			}
			ans = ans + ch + " ";
		}
		return ans.trim();
	}
	
}