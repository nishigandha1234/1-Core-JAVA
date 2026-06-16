/*2. Find the length of a string without using `length()`.*/

class FindLength2
{	
	public static void main(String x[])
	{
		String word = "Nishigandha";
		int count = 0;
		for(int i = 0 ; i < word.length() ; i++)
		{
			count++;
		}
		System.out.println("Length of String : "+count);
	}
}