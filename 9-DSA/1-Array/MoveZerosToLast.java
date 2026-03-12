import java.util.Scanner;

class MoveZerosToLast
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int ar[] = new int[5];
		for(int i = 0 ; i < ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int index = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] != 0)
			{
				ar[index+++] = ar[i];
			}
		}			
		while(index < ar.length)
		{
			ar[index++] = 0;
		}
	}
}