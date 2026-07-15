//48. Sort words in a sentence alphabetically.

class SortWordsInSentence
{
	public static void main(String x[])
	{
		String s = "Java is Easy, Java is Powerful";
		
		String str[] = s.split(" ");
		
		for(int i = 0 ; i < str.length-1 ; i++)
		{
			for(int j = i+1 ; j < str.length ; j++)
			{
				if(str[i].charAt(0) > str[j].charAt(0))
				{
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < str.length ; i++)
		{
			System.out.print(str[i] + " ");
		}
	}
}