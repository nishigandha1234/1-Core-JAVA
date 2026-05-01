/*Find max vowels in any substring of size k
Count vowels in first window Slide window: Remove left char Add right char
s = "abciiidef", k = 3
Windows: "abc" → 1 "bci" → 1 "cii" → 2 "iii" → 3*/

class MaxVowelSubstringSizeK
{
	public static void main(String x[])
	{
		String s = "abciiidef";
		int	k = 3;
		int count = 0, max = Integer.MIN_VALUE;
		for(int i = 0 ; i < k ; i++)
		{
			if("aeiou".indexOf(s.charAt(i)) != -1)
			{
				count++;
			}
		}
		max = count;
		
		for(int i = k ; i < s.length() ; i++)
		{
			if("aeiou".indexOf(s.charAt(i)) != -1)
			{
				count++;
			}
			if("aeiou".indexOf(s.charAt(i-k)) != -1)
			{
				count--;
			}
			max = Math.max(max, count);
		}
		System.out.println(max);
	}
}