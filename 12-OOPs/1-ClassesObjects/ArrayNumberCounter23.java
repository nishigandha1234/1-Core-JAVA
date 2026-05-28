/*Question 23: Write a Java program to implement an Array Number Counter using Method Overloading.
Create a class ArrayCount and overload method count():
- count(int arr[]) => Count even numbers in array
- count(int arr[], int size) => Count odd numbers in array
Input:Enter array elements : 5 8 12 7 9 4
Output: Even Numbers : 3 Odd Numbers : 3*/

import java.util.Scanner;
class ArrayCount
{
	void count(int arr[]) 
	{
		int even = 0 ;
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] % 2 == 0)
				even++;
		}
		System.out.println("Even Numbers are : " + even);
	}
	void count(int arr[], int size)
	{
		int odd = 0 ;
		for(int i = 0 ; i < size ; i++)
		{
			if(arr[i] % 2 != 0)
				odd++;
		}
		System.out.println("Odd Numbers are : " + odd);
	}
}
public class ArrayNumberCounter23
{
	public static void main(String x[])
	{
		ArrayCount s1 = new ArrayCount();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter Values in Array : ");
		for(int i = 0 ; i < arr.length ; i++)
		{
			arr[i] = sc.nextInt();
		}
		int size = arr.length;
	
		s1.count(arr);
		s1.count(arr, size);
	}
}