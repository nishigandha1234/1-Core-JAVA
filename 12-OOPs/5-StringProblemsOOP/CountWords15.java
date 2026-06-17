/*15. Count the number of words in a sentence.*/

import java.util.Scanner;
class CountWords15
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		
		int count = 0 ;
		for(int i = 0 ; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch != ' ' && (i == 0 || str.charAt(i-1) == ' '))
				count++;
		}
		System.out.println("Count of words "+count);
	}
}