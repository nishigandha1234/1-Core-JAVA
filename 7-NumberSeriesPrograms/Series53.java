// 	1  4  9  16  25  36  49  64  81  100
import java.util.Scanner;

class Series53
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		for(int i =1 ; i <= n ;i++)
		{
			System.out.print((int)Math.pow(i, 2)+" ");
		}
	}
}