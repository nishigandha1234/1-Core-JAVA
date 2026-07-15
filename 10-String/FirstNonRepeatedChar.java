//41. Find the first non-repeated character.

class FirstNonRepeatedChar
{
	public static void main(String x[])
	{
		String s = "programming";
		int[] freq = new int[256];

		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			freq[ch]++;	
		}
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(freq[s.charAt(i)] == 1)
			{
				System.out.println("First Non-Repeated Character: " + s.charAt(i));
				break;
			}
		}
	}
}