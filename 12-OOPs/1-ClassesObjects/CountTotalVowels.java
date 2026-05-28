/*1. Count Total Vowels
Problem Statement-Create class name as CountVowel with two methods:
void setString(String str)-This method accepts a string as parameter and stores it inside class variable.
int getVowelCount()-This method counts total vowels (a, e, i, o, u) present in string and returns total count.
Example Input: "Education" Output: 5
Explanation The vowels are: E, u, a, i, o Total vowels = 5*/

class Count{
	private String str;
	void setString(String str)
	{
		this.str = str;
	}
	int getVowelCount()
	{
		int count = 0;
		for(int i = 0 ; i < str.length() ; i++)
		{
			if("aeiouAEIOU".indexOf(str.charAt(i)) != -1)
				count++;
		}
		return count;
	}
}
public class CountTotalVowels
{
	public static void main(String x[])
	{
		Count c = new Count();
		c.setString("Education");
		System.out.println(c.getVowelCount());
	}
}