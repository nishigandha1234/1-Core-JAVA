/*68. Convert a sentence into camelCase.*/

import java.util.Scanner;
class ConvertSentenceCamelcase
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine(); 
		String[] words= s.split(" ");
		String ans = words[0].toLowerCase();
		
		for(int i = 1 ; i < words.length ; i++)
		{
			ans = ans + Character.toUpperCase(words[i].charAt(0)) + words[i].substring(1).toLowerCase();
		}
		System.out.println("Camel Case : "+ans);
    }
}