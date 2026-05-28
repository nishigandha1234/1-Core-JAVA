/*Question 21: Write a Java program to implement an Array Sum Calculator using Method Overloading.
Create a class ArrayOperation and overload method sum():
- sum(int arr[]) => Find sum of all array elements
- sum(int arr[], int size) => Find average of array elements
Input:
Enter array elements : 10 20 30 40 50

Output:
Sum : 150
Average : 30*/

import java.util.Scanner;
class ArrayOperation
{
	void sum(int arr[])
	{
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum : " + sum);
	}
	void sum(int arr[], int size)
	{
		int sum = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			sum += arr[i];
		}
		int average = sum/size;
		System.out.println("Average : "+average);
	}
}
public class ArraySumCalculator21
{
	public static void main(String x[])
	{
		ArrayOperation s1 = new ArrayOperation();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Values in Array : ");
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		int size = arr.length;
	
		s1.sum(arr);
		s1.sum(arr,size);
	}
}