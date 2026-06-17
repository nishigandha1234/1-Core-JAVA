/*20. Concatenate two strings without using `concat()`*/

import java.util.Scanner;
class ConcatWithoutInBuilt20
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter String 2 : ");
		String str2 = sc.nextLine();
		
		String ans = str1+str2;
		System.out.println("Concatenated String is "+ ans);
	}
}