import java.util.*;

public class MenuDrivenApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Menu you want to perform from Below : ");
		System.out.println();
		System.out.println("Case 1 : Check Character is vowel or consonant. ");
		System.out.println("Case 2 : Find the max number using 3 numbers. ");
		System.out.println("Case 3 : Check number is divisible by 5 & 11. ");
		System.out.println();
		int menu = sc.nextInt();
		
		switch(menu)
		{
			case 1 : 
			{
				System.out.println("Enter the Character : ");
				char ch = sc.next().charAt(0);

				System.out.println( ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ? ch+" Character is Vowel" : ch+" Character is Consonant");
				break;
			}
			case 2 : 
			{
				System.out.println("Enter the First Number : ");
				int a = sc.nextInt();
				System.out.println("Enter the Second Number : ");
				int b = sc.nextInt();
				
				System.out.println(a > b ? a+" is a Maximum Number" : b+" is Maximum Number");
				break;
			}
			case 3 : 
			{
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				if(num % 5 == 0 && num % 11 == 0)
					System.out.println(num + " is Divisible By 5 & 11");
				else 
					System.out.println(num + " is NOT Divisible By 5 & 11");
				break;
			}
			default : 
			{
				System.out.println("Invalid Menu Entered...!!!");
				break;
			}
		}
	}
}
		