//2 729 4 512 6 343 8 216 10 125 12 64 14 27 16
import java.util.Scanner;
class Series52
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		int a = 2;
		int b =1;
		
		for(int i = 1 ; i <= n ; i++)
		{	
			int table = 2*i;
			int cube = (int)Math.pow(10-i, 3);
			System.out.print(table+" "+cube+" ");  

		}
	}

}