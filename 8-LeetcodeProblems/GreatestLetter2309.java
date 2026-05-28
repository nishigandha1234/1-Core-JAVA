/*2309. Greatest English Letter in Upper and Lower Case
Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.An English letter b is greater than another letter a if b appears after a in the English alphabet.
Example 1:Input: s = "lEeTcOdE" Output: "E"
Explanation:The letter 'E' is the only letter to appear in both lower and upper case.*/

class GreatestLetter2309
{
	public static void main(String x[])
	{
		String s = "lEeTcOdE";
		System.out.println(greatestLetter(s));
	}
	public static String greatestLetter(String s) 
	{
		String ans = "";
		
        for(char ch = 'Z' ; ch >= 'A' ; ch--)
		{
			boolean flagLower = false;
			boolean flagUpper = false;
			for(int i = 0 ; i < s.length() ; i++)
			{
				char ch1 = s.charAt(i);
				
				if(ch1 == ch)
					flagUpper = true;
				if(ch1 == (char)(ch+32))
					flagLower = true;
			}
			
			if(flagLower && flagUpper)
			{
				ans+=ch ;
				return ans;
			}
		}
		return ans;
    }	
}