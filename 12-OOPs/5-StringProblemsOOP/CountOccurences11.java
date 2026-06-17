/*11. Count the occurrences of a particular character.*/
import java.util.Scanner;
class CountOccurences11
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Enter the Character : ");
		char character = sc.next().charAt(0);
		
		int count = 0 ;
		
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			
			if(character == ch)
				count++;
		}
		System.out.println("Count of the character "+character+ " is : "+count );
	}
}