import java.util.Scanner;

class SelectionSort
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[] = new int[5] ; 
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			int min_index = i;
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[j] < a[min_index])
				{
					min_index = j;
				}
			}
			int temp = a[i];
			a[i] = a[min_index];
			a[min_index] = temp;
		}
		
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}