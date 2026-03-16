import java.util.Scanner;

class Q39SortTheArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : "); // [12, 5, 9, 34, 1]
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] > a[j])
				{
					int temp = a[i] ; 
					a[i] = a[j] ;
					a[j] = temp;
				}
			}
		}
		System.out.println("Ascending Array : ");
		for(int i = 0 ; i < a.length ; i ++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nDescending Array : ");
		for(int i = a.length-1 ; i >= 0 ; i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}