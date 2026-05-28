/*2. Count Total Consonants
Problem Statement- Create class CountConsonant with methods:
void setString(String str) Accepts string from user.
int getConsonantCount() Counts all consonants and returns count.
Example Input: "Computer" Output: 5*/
class Count
{
	private String str;

	void setString(String str)
	{
		this.str = str;
	}

	int getConsonantCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			if("aeiouAEIOU".indexOf(ch) == -1)
			{
				count++;
			}
		}
		return count;
	}
}

public class CountTotalConsonants
{
	public static void main(String x[])
	{
		Count c = new Count();
		c.setString("Computer");
		System.out.println(c.getConsonantCount());
	}
}