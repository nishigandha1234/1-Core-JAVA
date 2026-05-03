/*2810. Faulty Keyboard
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.Return the final string that will be present on your laptop screen.
Example 1: Input: s = "string" Output: "rtsng"*/

class FaultyKeyboard
{
	public static void main(String x[])
	{
		String s = "string";
		System.out.println(finalString(s));
	}
	public static String finalString(String s) 
	{
        String ans = "";
		
		for(int i = 0 ; i < s.length() ; i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'i')
			{
				String rev = "";
				for(int j = ans.length()-1 ; j >= 0 ; j--)
				{
					rev += ans.charAt(j);
				}
				ans = rev;
			}
			else
			{
				ans += ch;
			}
		}
		return ans;
    }
}