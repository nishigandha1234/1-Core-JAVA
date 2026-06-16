/*8. Convert a string to lowercase*/

class ConvertLowercase8
{	
	public static void main(String x[])
	{
		String word = "NISHIGANDHA";
		int count = 0;
		System.out.println("Converted in Lowercase : ");
		for(int i = 0 ; i < word.length() ; i++)
		{   
			char ch = word.charAt(i) ;
			if(ch >= 'A' && ch <= 'Z')
			{
				ch = (char)(ch + 32);
			}
			System.out.print(ch);
		}
		
	}
}