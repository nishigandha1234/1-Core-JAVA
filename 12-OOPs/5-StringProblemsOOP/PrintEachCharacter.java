/*1. Print each character of a string.*/

class PrintEachCharacter
{	
	public static void main(String x[])
	{
		String word = "Nishigandha";
		
		for(int i = 0 ; i < word.length() ; i++)
		{
			char ch = word.charAt(i);
			System.out.println(ch + " ");
		}
	}
	
}