import java.util.Scanner;

class Q25MoveZerosToLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : "); //}
		int ar[] = new int[5];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int j = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] != 0)
			{
				ar[j++] = ar[i];
			}
		}			
		while(j < ar.length)
		{
			ar[j++] = 0;
		}
		System.out.println("After Removing Zeros in Array : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			System.out.print(ar[i] + " ");
		}
	}

}