/*65. Check whether a string ends with a given suffix.*/

import java.util.Scanner;
class CheckStringStartswithSuffix
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.next(); //springboot
		System.out.println("Enter the Prefix : ");
		String suffix = sc.next();//boot
		s = s.toLowerCase();
		suffix = suffix.toLowerCase();
		boolean flag = true;
		
		if(suffix.length() > s.length())
		{
			flag = false;
		}
		else
		{
			int start = s.length() - suffix.length();
			
			for(int i = 0 ; i < suffix.length() ; i++)
			{
				if(s.charAt(start+i) != suffix.charAt(i))
				{
					flag = false;
					break;
				}
			}
		}
		if(flag)
            System.out.println("String ends with the given Sufix");
        else
            System.out.println("String does not ends with the given suffix");
    }
}