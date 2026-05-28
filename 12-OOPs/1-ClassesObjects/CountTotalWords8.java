/*8. Count Total Words
Create class WordCount with methods:
void setString(String str)-Accepts sentence.
int getWordCount()-Counts total words and returns count.
Example Input: "Java is easy" Output: 3*/

class WordCount
{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getWordCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) != ' ' && (i == 0 || str.charAt(i-1) == ' '))
				count++;
		}
		return count;
	}
}
public class CountTotalWords8
{
	public static void main(String x[])
	{
		WordCount s = new WordCount();
		s.setString("Hello, my name is John");
		System.out.println(s.getWordCount());
	}
}