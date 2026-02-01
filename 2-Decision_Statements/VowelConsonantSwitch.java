import java.util.*;

public class VowelConsonantSwitch
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Character : ");
		char ch = sc.next().charAt(0);
		
		switch(ch)
		{
			case 'A' : case 'a' :
			{
				System.out.println(ch + " Vowel"); 
				break;
			}
			case 'E' : case 'e' : 
			{
				System.out.println(ch + " Vowel"); 
				break;				
			}
			case 'I' :  case 'i' : 
			{
				System.out.println(ch + " Vowel"); 
				break;	
			}
			case 'O' : case 'o' : 
			{
				System.out.println(ch + " Vowel"); 
				break;	
			}
			case 'U' : case 'u' : 
			{
				System.out.println(ch + " Vowel"); 
				break;	
			}
			default :
			{
				System.out.println("Consonant");
			}
		}
	}
}