/*13. Find the last occurrence of a character.*/

import java.util.Scanner;
class LastOccurences13
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Enter the Character : ");
		char search = sc.next().charAt(0);
		
		int index = -1;
		
		for(int i = str.length()-1 ; i >= 0 ; i--)
		{
			if(str.charAt(i) == search)
			{
				index = i;
				break;
			}	
		}
		if(index != -1)
			System.out.println("Last occurrence of " + search + " is at index " + index);
		else
			System.out.println("Character not found");
	}
}