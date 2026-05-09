
public class CountVowel
{
	public static void main(String x[])
	{
		String s = "education";
		System.out.println(countVowel(s));
	}
	public static int countVowel(String s)
	{
		int count = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			{
				count++;
			}
		}
		return count;
	}
}