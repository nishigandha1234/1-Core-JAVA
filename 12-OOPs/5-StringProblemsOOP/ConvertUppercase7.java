/*7. Convert a string to uppercase.*/

class ConvertUppercase7
{	
	public static void main(String x[])
	{
		String word = "nishigandha";
		int count = 0;
		System.out.println("Converted in Uppercase : ");
		for(int i = 0 ; i < word.length() ; i++)
		{   
			char ch = word.charAt(i) ;
			if(ch >= 'a' && ch <= 'z')
			{
				ch = (char)(ch - 32);
			}
			System.out.print(ch);
		}
		
	}
}