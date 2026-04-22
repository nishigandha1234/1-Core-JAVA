import java.util.Scanner;

class SumOfDigInStr
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		int sum = 0 ;
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char ch = str.charAt(i);
			
			if(ch >= '0' && ch <= '9')
			{
				sum += ch - '0';
			}
		}
		System.out.println("Sum :" + sum);
	}
}