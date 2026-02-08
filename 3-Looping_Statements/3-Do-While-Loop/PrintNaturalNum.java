import java.util.Scanner;

public class PrintNaturalNum
{
	public static void main(String[] x)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = sc.nextInt();
		int i = 1;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i <= n );
	}
}