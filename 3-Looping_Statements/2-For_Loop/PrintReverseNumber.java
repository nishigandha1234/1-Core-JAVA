import java.util.Scanner;

public class PrintReverseNumber
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value : " );
		int n = sc.nextInt();
		
		for(int i = n; i >= 1 ; i--)
		{
			System.out.println(i+" ");
		}
	}
}