/*81. Generate all possible strings from a set of characters.*/

import java.util.Scanner;
class GeneratePossibleStrings
{	
	public static void main(String x[])
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.next();
		char[] ch = s.toCharArray();
		
		for(int i = 0 ; i < ch.length ; i++)
		{
			for(int j = 0 ; j < ch.length ; j++)
			{
				if(i != j)
				{
					for(int k = 0 ; k < ch.length ; k++)
					{
						if(i != k && j != k)
							System.out.println(ch[i]+" "+ch[j]+" "+ch[k]);
					}
				}
			}
		}
	}

	

}