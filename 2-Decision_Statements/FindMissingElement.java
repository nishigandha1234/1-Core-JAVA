import java.util.*;

public class FindMissingElement
{
	public static void main(String x[])
	{	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int[] ar = new int[n - 1];

        System.out.print("Enter " + (n - 1) + " elements: ");
        
		for(int i = 0; i < ar.length; i++)
        {
            ar[i] = sc.nextInt();
        }
		int expectedSum = n * (n+1) / 2;
		int actualSum = 0;
		
		for(int i = 0; i < ar.length; i++)
		{
			actualSum += ar[i];
		}
		int missing = expectedSum - actualSum;
		System.out.println(missing);
	}
}