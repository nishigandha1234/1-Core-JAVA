//1  2  4  7  11  16  22  29  37  46
import java.util.Scanner;
class Series54
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int diff = 1;
		int num = 1;
		for(int i = 1 ; i<= n ; i++)
		{
			num += diff;
			System.out.print(num+" ");
			diff++;
		}
	}
}