import java.util.Scanner;

class FindMaxSumOfAdjPair
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array :" );
		int[] a = new int[6];
		for(int i = 0 ; i < a.length ; i++){
			a[i] = sc.nextInt();
		}
		
		int sum = 0 , maxSum = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < a.length ; i+=2)
		{
			int j = i+1;
			sum = a[i] + a[j];
			if( sum > maxSum)
			{
				maxSum = sum;
			}
		}
		System.out.println("Max sum is : "+ maxSum);
	}
}