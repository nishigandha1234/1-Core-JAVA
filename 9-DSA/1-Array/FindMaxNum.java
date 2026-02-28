import java.util.Scanner;

public class FindMaxNum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int [] ar = new int[5];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int max = ar[0];
		
		for(int i = 1 ; i < ar.length ; i++)
		{
			if(ar[i] > max)
			{
				max = ar[i];
			}
		}
		System.out.println("Max : "+max);
	}
}