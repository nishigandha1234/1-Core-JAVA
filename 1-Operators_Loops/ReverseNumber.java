import java.util.Scanner;
public class ReverseNumber
{
	public static void main(String[] x)
	{
		int rev = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		while(num != 0)
		{
			int rem = num%10;
			rev = rev*10 + rem;
			num/=10;
		}
		System.out.println(rev);
	}
}