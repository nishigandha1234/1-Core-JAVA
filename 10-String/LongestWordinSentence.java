//50. Find the longest word in a sentences

class LongestWordinSentence
{
	public static void main(String x[])
	{
		String s = "java is Powerful, Java is Easy";
		String longest = "";	
		String word = "";	
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) != ' ')
			{
				word += s.charAt(i);
			}
			else
			{
				if(word.length() > longest.length())
				{
					longest = word;
				}
				word = "";
			}
		}	
		if(word.length() > longest.length())
			longest = word;
		
		System.out.println("Longest Word = "+longest);
		System.out.println("Longest Length = "+longest.length());
	}
}