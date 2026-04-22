import java.util.*;

class AnagramStringWithoutBI
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.next();
		System.out.println("Enter the Second String : ");
		String str2 = sc.next();
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		if(ch1.length != ch2.length)
		{
			System.out.println("Strings are Not Anagram");
		}
		else
		{
			for(int i = 0 ; i < ch1.length ; i++)
			{
				for(int j = i+1 ; j < ch1.length ; j++)
				{
					if(ch1[i] > ch1[j])
					{
						char temp = ch1[i];
						ch1[i] = ch1[j];
						ch1[j] = temp;
					}
					if(ch2[i] > ch2[j])
					{
						char temp = ch2[i];
						ch2[i] = ch2[j];
						ch2[j] = temp;
					}
				}
			}
	
			boolean flag = true;
			
			for(int i = 0 ; i < ch1.length ; i++)
			{
				if(ch1[i] != ch2[i])
				{
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("Anagram");
			else System.out.
			else System.out.println("NOT Anagram");
		}
	}
}