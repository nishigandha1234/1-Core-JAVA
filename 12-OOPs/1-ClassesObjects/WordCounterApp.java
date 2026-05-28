/*Example: WAP to create class name as Count words from string.You have to Create class name as WordCounter with two methods 
void setValue(String str): this method is used for accept String as parameter 
int getWordCount(): this method can count word and return word count */

class Count
{
	private String str;
	void setString(String data)
	{
		str = data;
	}
	int getCount()
	{
		String[] ans = str.split(" ");
		return ans.length;
	}
}
public class WordCounterApp
{
	public static void main(String x[])
	{
		Count c = new Count();
		c.setString("I LOVE JAVA");
		System.out.println(c.getCount());
	}
}