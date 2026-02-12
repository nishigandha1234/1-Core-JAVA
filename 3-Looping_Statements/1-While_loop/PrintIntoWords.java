import java.util.Scanner;

class PrintIntoWords
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		int rev = 0;
		int temp = num;
		
		while(temp!=0)
		{
			rev = rev*10 + temp%10;
			temp/=10;
		}
		
		if(num==0)
		{
			System.out.println("Zero");
			return;
		}
		
		while(rev > 0)
		{
			int digit = rev%10;
			
			switch(digit)
			{
				case 0 : System.out.print("Zero"); break;
				case 1 : System.out.print("One"); break;
				case 2 : System.out.print("Two"); break;
				case 3 : System.out.print("Three"); break;
				case 4 : System.out.print("Four"); break;
				case 5 : System.out.print("Five"); break;
				case 6 : System.out.print("Six"); break;
				case 7 : System.out.print("Seven"); break;
				case 8 : System.out.print("Eight"); break;
				case 9 : System.out.print("Nine"); break;
			}
			rev/=10;
		}
	}
}