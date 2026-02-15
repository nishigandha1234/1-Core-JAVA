import java.util.Scanner;

class NumberPrograms 
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Choice from Below : ");
		
		System.out.println("1. Harshad Number : ");
		System.out.println("2. Automorphic Number : ");
		System.out.println("3. Happy Number : ");
		System.out.println("4. Armstrong Number : ");
		System.out.println("5. Strong Number : ");
		System.out.println("6. Neon Number : ");
		System.out.println("7. Pronic Number : ");
		System.out.println("8. Perfect Number : ");
		System.out.println("9. Duck Number : ");
		System.out.println("10.Spy Number : ");
		System.out.println("11.Prime Number : ");
		System.out.println("12.Kaprekar Number : ");
		System.out.println("13.Disarium Number : ");
		System.out.println("14.Abundant Number : ");
		System.out.println("15.Krishnamurthy  Number : ");
		
		int choice = sc.nextInt();
		
		switch(choice)
		{
			case 1 :
			{
				System.out.println("Welcome to Harshad Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				int sum= 0;
				int temp = num;
				for(int i = 1 ; i < num ; i++)
				{
					while(temp != 0)
					{
						int rem = temp%10;
						sum+=rem;
						temp/=10;
					}
				}
				if(num%sum == 0) System.out.println("Harshad Number");
				else System.out.println("NOT Harshad Number");
				break;
			}
			case 2 :
			{
				System.out.println("Welcome to Automorphic Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				int square = num*num;
				int temp = num;
				while(
				{
					while(temp%10 == 0 && square%10)
					{
						System.out.println("Automorphic Number");
					}
				}
				System.out.println("NOT Automorphic Number");
			}
			case 3 :
			{
				System.out.println("Welcome to Automorphic Number : ");
				System.out.println("Enter the Number : ");
				int num = sc.nextInt();
				int square = num*num;
				int temp = num;
				while(
				{
					while(temp%10 == 0 && square%10)
					{
						System.out.println("Automorphic Number");
					}
				}
				System.out.println("NOT Automorphic Number");
			}
		}
	}
}