import java.util.Scanner;

class PronicNumber
{
	public static void main(String x[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range : ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i<n ; i++)
		{
			int res = i*(i+1);
			System.out.print(res+" ");
		}
	}
}
