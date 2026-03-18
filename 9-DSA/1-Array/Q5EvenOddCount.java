import java.util.Scanner;

class Q5EvenOddCount
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size in Array : ");
		int size = sc.nextInt();
		System.out.println("Enter the Values in Array : ");
		int ar[] = new int[size];
		
		for(int i = 0 ; i< ar.length ; i++)
		{
			ar[i] = sc.nextInt();
		}
		int evenCount = 0, oddCount = 0;
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 == 0)
				evenCount++;
		}
				System.out.print("Even Count : " + evenCount);
		System.out.println();
		for(int i = 0 ; i < ar.length ; i++)
		{
			if(ar[i] % 2 != 0)
				oddCount++;
		}
		System.out.print("Odd Count : "+oddCount);
	}
}