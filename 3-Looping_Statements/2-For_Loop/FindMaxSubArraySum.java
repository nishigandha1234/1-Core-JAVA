import java.util.Scanner;

class FindMaxSubArraySum
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of k : ");
		int k = sc.nextInt();
		System.out.println("Enter the Number : ");
		int[] arr = new int[8];
		int max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < (arr.length-k) ; i++)
		{	
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < (arr.length); i++)
		{
			int sum = 0;
			for(int j = i ; j < (i+k) ; j++)
			{
				sum+= arr[j];
			}
			if(sum > max)
			{	
				max = sum;
			}
		}
		
	}
}
		