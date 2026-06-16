/*10. Check whether a string is a palindrome.*/

class PalindromeString10
{	
	public static void main(String x[])
	{
		String word = "madam";
		String rev = "";
		for(int i = word.length()-1 ; i >= 0 ; i--)
		{   
			char ch = word.charAt(i);
			rev += ch;
		}
		if(word.equals(rev))
			System.out.println("String is Palindrome ");
		else
			System.out.println("String is NO
			System.out.println("String is NOT Palindrome ");
	}
}