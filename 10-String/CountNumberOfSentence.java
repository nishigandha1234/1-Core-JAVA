//49. Count the number of sentences in a paragraph.

class CountNumberOfSentence
{
	public static void main(String x[])
	{
		String s = "Java is easy to learn. It is platform independent! Do you like Java? Yes.";
		int count = 0 ;
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '!')
				count++;
		}
		System.out.println("The count of Paragraph is : "+ count);
	}
}