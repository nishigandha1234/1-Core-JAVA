import java.util.Scanner;

public class FindSecondMax
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Arrays : ");
		int[] ar = new int[6];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int max = ar[0];
		int secMax = Integer.MIN_LENGTH;
		for(int i = 1 ; i< ar.length ; i++)
		{
			if(ar[i] > max)
			{
				secMax = max;
				max= ar[i];
			}
			if(ar[i] > secMax && ar[i] < max)
			{
				secMax = ar[i];
			}
		}
		System.out.println(secMax);
	}
}