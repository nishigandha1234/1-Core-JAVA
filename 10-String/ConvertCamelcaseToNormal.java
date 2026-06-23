/*69. Convert camelCase into a normal sentence.*/

import java.util.Scanner;
class ConvertCamelcaseToNormal
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine(); //helloWorldJava
	
		String ans = "";
		ans += Character.toUpperCase(s.charAt(0));
		
		for(int i = 1 ; i < s.length() ; i++)
		{
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				ans += " ";
			ans+=s.charAt(i);
		}
		System.out.println("Normal Case : "+ans);
    }
}