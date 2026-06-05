/*30. Count Occurrence of Word
Class Name: WordOccurrence
Methods:
void setData(String sentence, String word)
int getOccurrence()
Example
Input:
 Sentence: "Java is easy and Java is powerful"
Word: "Java"
Output:
 2
*/
class WordOccurrence
{
	private String sentence; 
	private String word; 
	
	void setData(String sentence, String word)
	{
		this.sentence = sentence;
		this.word = word;
	}
	int getOccurrence()
	{
		int count = 0;
		String temp = "";
		for(int i = 0 ; i < sentence.length() ; i++)
		{
			char ch = sentence.charAt(i);
			
			if(ch != ' ')
				temp += ch;
			else
			{
				if(temp.equals(word))
				{
					count++;
				}
				temp = "";
			}
		}
		if(temp.equals(word))
			count++;
				
		return count;
	}
}
public class CountOccurrenceofWord30
{
	public static void main(String x[])
	{
		WordOccurrence r1 = new WordOccurrence();
		r1.setData("Java is easy and Java is powerful", "Java");
		System.out.println(r1.getOccurrence());
	}
}