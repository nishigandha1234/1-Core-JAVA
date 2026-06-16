/*9. Reverse a string*/

class ReverseString9
{	
	public static void main(String x[])
	{
		String word = "NISHIGANDHA";
		String rev = "";
		for(int i = word.length()-1 ; i >= 0 ; i--)
		{   
			char ch = word.charAt(i);
			rev += ch;
		}
		System.out.println("Reverse : "+ rev);
	}
}