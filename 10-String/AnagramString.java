import java.util.*;

class AnagramString
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String : ");
		String str1 = sc.next();
		System.out.println("Enter the Second String : ");
		String str2 = sc.next();
		
		char[] ch1 = str1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("NOT Anagram");
		}
	}
}