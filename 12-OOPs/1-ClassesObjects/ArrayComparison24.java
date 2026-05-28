/*Question 24: Write a Java program to implement Array Comparison using Method Overloading.
Create a class ArrayCompare and overload method compare():
- compare(int arr1[], int arr2[]) => Find sum of both arrays
- compare(int arr1[], int arr2[], int size) => Find difference of sums
Input: Array1 : 10 20 30 Array2 : 5 15 25
Output: Sum of Array1 : 60 Sum of Array2 : 45 Difference : 15*/

import java.util.Scanner;
class ArrayCompare
{
	void compare(int arr1[], int arr2[])
	{
		int sum1 = 0 ;
		for(int i = 0 ; i < arr1.length ; i++)
		{
			sum1 += arr1[i];
		}
		System.out.
		System.out.println("Sum of Array 1 : " + sum1);
		
		int sum2 = 0 ;
		for(int i = 0 ; i < arr2.length ; i++)
		{
			sum2 += arr2[i];
		}
		System.out.println("Sum of Array 2 : " + sum2);
	}
	void compare(int arr1[], int arr2[], int size) 
	{
		int sum1 = 0 ;
		for(int i = 0 ; i < arr1.length ; i++)
		{
			sum1 += arr1[i];
		}
		int sum2 = 0 ;
		for(int i = 0 ; i < arr2.length ; i++)
		{
			sum2 += arr2[i];
		}
		System.out.println("The Difference of the Sum is : " + (sum1-sum2));
	}
}
public class ArrayComparison24
{
	public static void main(String x[])
	{
		ArrayCompare s1 = new ArrayCompare();
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		System.out.println("Enter Values in Array 1 : ");
		for(int i = 0 ; i < arr1.length ; i++)
		{
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter Values in Array 2 : ");
		for(int i = 0 ; i < arr2.length ; i++)
		{
			arr2[i] = sc.nextInt();
		}
		int size = arr1.length;
	
		s1.compare( arr1, arr2);
		s1.compare( arr1, arr2, size) ;
	}
}