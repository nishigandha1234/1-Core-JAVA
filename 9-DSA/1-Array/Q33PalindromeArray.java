import java.util.Scanner;

class Q33PalindromeArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int i = 0 , j = a.length-1 ;
		while(i < j)
		{
			if(a[i] == a[j])
			{
				i++;
				j--;
			}
			else
			{
				System.out.println("Not Palindromic Array");
				return;
			}
		}
		System.out.print("Array is Palindromic ");
	}
}