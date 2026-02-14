//2 6 7 21 22 66 67 201 ...
// *3 & *3+1
import java.util.Scanner;
class Series65
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n : ");
		int n = sc.nextInt();
		
		int num = 2;
		for(int i =1 ; i <= n ; i++)
		{
			System.out.print(num+" ");
			num*=3;
			System.out.print(num+" ");
			num+=1;
		}
	}
}