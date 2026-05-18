/*56 Recursive palindrome check */

class ReversePlaindromeCheck56
{
	public static void main(String x[])
	{
		String s = "aba";
		String rev = reverse(s);
		if(s.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("NOT Palindrome");
	}
	public static String reverse(String s)
	{
		if(s.length() == 0)
		{
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
}