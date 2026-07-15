
class CountWordsInString
{
	public static void main(String x[])
	{
		String s = "Java is easy, java is powerful";
		s = s.toLowerCase();
		String[] words = s.split(" ");
		
		for(int i = 0 ; i < words.length ; i++)
		{
			int count = 1;
			
			if(words[i].equals("-1"))
				continue;
			
			for(int j = i+1; j < words.length ; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j] = "-1";
				}
			}	
			if(!words[i].equals("-1"))
				System.out.println(words[i] + " : " + count);
		}
	}	
}