import java.util.Scanner;

class SumofArray
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int arr[] = new int[5];
		
		for(int i = 0 ; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0 ; i< arr.length ; i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of Array is : " + sum);
	}
}