//1  2  2  4  3  6  4  8  5  10  6  12
import java.util.Scanner;
class Series51
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		int num = 1;
		for(int i = 1 ; i<= n ; i++)
		{
			int table = 2*i;
			System.out.print(num +" "+table+" ");
			num++;
		}
	}
}