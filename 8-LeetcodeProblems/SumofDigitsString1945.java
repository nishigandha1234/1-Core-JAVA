/*1945. Sum of Digits of String After Convert
You are given a string s consisting of lowercase English letters, and an integer k. Your task is to convert the string into an integer by a special process, and then transform it by summing its digits repeatedly k times. More specifically, perform the following steps:
Convert: "zbax" ➝ "(26)(2)(1)(24)" ➝ "262124" ➝ 262124  Transform #1: 262124 ➝ 2 + 6 + 2 + 1 + 2 + 4 ➝ 17 Transform #2: 17 ➝ 1 + 7 ➝ 8
Return the resulting integer after performing the operations described above.
Example 1:Input: s = "iiii", k = 1  Output: 36*/

class SumofDigitsString1945
{
	public static void main(String x[])
	{
		String s = "iiii";
		int	k = 1;
		System.out.println(getLu
		System.out.println(getLucky(s, k));
	}
	public static int getLucky(String s, int k) 
	{
		String ans = "";
	
		int sum = 0;
		for(int i = 0 ; i < s.length() ; i++)
		{
			ans += (s.charAt(i) - 'a' + 1);
		}
		for(int i = 0 ; i < ans.length() ; i++)
		{
			sum += ans.charAt(i) - '0';
		}
		k--;
		
		while(k != 0)
		{
			int temp = 0;
			while(sum != 0)
			{
				temp += sum%10;
				sum /= 10;
			}
			sum = temp;
			k--;
		}
		return sum;
	}
}