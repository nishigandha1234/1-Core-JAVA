/*12. Find the first occurrence of a character.*/

import java.util.Scanner;
class FirstOccurences12
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Enter the Character : ");
		char search = sc.next().charAt(0);
		
		int index = -1;
		
		for(int i = 0 ; i < str.length(); i++)
		{
			if(str.charAt(i) == search)
			{
				index = i;
				break;
			}	
		}
		if(index != -1)
			System.out.println("First occurrence of " + search + " is at index " + index);
		else
			System.out.println("Character not found");
	}
}