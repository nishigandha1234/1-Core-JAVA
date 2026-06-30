/*Q8. Reverse Each Word Without Changing Position
Example Input  : Java is powerful
Output : avaJ si lufrewop*/

import java.util.*;
class ReverseEachWord
{	
	public static void main(String x[])
	{
		String s = "Java is powerful";
		reverseWord(s);
	}
	public static void reverseWord(String s)
	{
		String[] str = s.split(" ");
		
		for(int i = 0 ; i < str.length ; i++)
		{
			String word = str[i];
			String rev = "";
			for(int j = word.length()-1 ; j >= 0 ; j--)
			{
				rev += word.charAt(j);
			}
			System.out.print(rev+" ");
		}
	}
}