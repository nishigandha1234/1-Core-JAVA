//43. Remove duplicate characters from a string.

class RemoveDuplicateCharacter
{
	public static void main(String x[])
	{
		String s = "programming";
		int[] freq = new int[256];
		String ans = "";
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			if(freq[s.charAt(i)] == 0)
			{
				ans += s.charAt(i);
				freq[s.charAt(i)]++;
			}
		}
		System.out.println(ans);
	}
}