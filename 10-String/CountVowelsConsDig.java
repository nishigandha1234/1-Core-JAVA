import java.util.Scanner;

class CountVowelsConsDig
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		int countVow = 0, countConso = 0 ,digit = 0;
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch == 'A' || ch == 'E' || ch == 'I'|| ch == 'O' || ch == 'U' || ch == 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u') 
			{
				countVow++;
			}
			else if(ch >= '0' && ch <= '9') //lower to upper -32
			{
				digit++;
			}
			else
			{
				countConso++;
			}
		}
		System.out.println("Count of Vowels is : "+countVow);
		System.out.println("Count of Consonant is : "+countConso);
		System.out.println("Count of Digits is : "+digit);
	}
}