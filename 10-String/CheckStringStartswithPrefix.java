/*64. Check whether a string starts with a given prefix.*/

import java.util.Scanner;
class CheckStringStartswithPrefix
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next(); //springboot
		System.out.println("Enter the Prefix : ");
		String prefix = sc.next();//spring
		s = s.toLowerCase();
		prefix = prefix.toLowerCase();
		
		boolean flag = true;
		
		if(prefix.length() > s.length())
		{
			flag = false;
		}
		else
		{
			for(int i = 0 ; i < prefix.length(); i++)
			{
				if(s.charAt(i) != prefix.charAt(i))
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
            System.out.println("String starts with the given prefix");
        else
            System.out.println("String does not start with the given prefix");
    }
}