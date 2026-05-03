/*Longest Substring Without Repeating Characters Find longest substring with no repeating characters. Expand window If duplicate → shrink window
"abcabcbb" "abc" → length 3*/

class LongestSSWithoutRepeatingCharacters
{
	public static void main(String x[])
	{
		String s = "abcabcbb";
		
		int[] freq = new int[256];
		int start = 0, max = 0;
		for(int end = 0 ; end < s.length() ; end++)
		{
			freq[s.charAt(end)]++;
			
			while(freq[s.charAt(end)] > 1)
			{
				freq[s.charAt(start)]--;
				start++;
			}
			max = Math.max(max, end-start+1);
		}
		System.out.println(max);
		System.out.println(max);
	}
}