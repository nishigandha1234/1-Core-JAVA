/*16. Find the ASCII value of each character.*/

import java.util.Scanner;
class ASCIIValue16
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			System.out.println(ch +" = "+ (int)ch);
		}
	}
}