import java.util.Scanner;

class InputValueArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int ar[] = new int[5];
		
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
	
		for(int i = 0 ; i < ar.length ; i++)
		{
			System.out.println(ar[i]);
		}
	
	}
}