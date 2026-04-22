import java.util.*;

class ThirdWayAnagramString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.next();
		System.out.println("Enter the Second String : ");
		String str2 = sc.next();
		
		if(str1.length() != str2.length())
		{
			System.out.println("Strings are Not Anagram");
		}
		else
		{
			int count[] = new int[256];
			for(int i = 0 ; i < str1.length() ; i++)
			{
				count[str1.charAt(i)]++;
				count[str2.charAt(i)]--;
			}
			boolean flag = true;
			
			for(int i = 0 ; i < count.length ; i++)
			{
				if(count[i] != 0)
				{
					flag = false;
					break;
				}
			}
			if(flag) System.out.println("Anagram");
			else System.out.println("NOT Anagram"
			else System.out.println("NOT Anagram");
		}
	}
}