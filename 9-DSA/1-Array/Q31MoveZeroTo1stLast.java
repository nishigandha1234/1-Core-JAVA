import java.util.Scanner;

class Q31MoveZeroTo1stLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[8];
		int pos= 0;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != 0)
			{
				int temp = a[i];
				a[i] = a[pos];
				a[pos] = temp;
				pos++;
			}
		}
		System.out.println("After Removing Zeros : ");
		for(int i = 0 ; i < a.length ; i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}