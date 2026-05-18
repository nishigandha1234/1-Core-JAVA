/*85 Print all substrings — */

class PrintAllSubstrings85
{
	public static void main(String x[])
	{
		String s = "Nishigandha";
		printSubstring(s);
	}
	public static void printSubstring(String s)
	{
		for(int i = 0 ; i < s.length() ; i++)
		{
			for(int j = i+1 ; j <= s.length() ; j++)
			{
				String ans = s.substring(i, j);
				System.out.print(ans+" ");
			}
		}
	}
}