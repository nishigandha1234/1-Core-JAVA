import java.util.Scanner

class MissingElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values in Array : ");
		int a[] = new int[5];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int diff = a[i+1] - a[i];

			if(diff > 1)
			{
				System.out.print("\nMissing Elements are : ");
				for(int j = 1 ; j < diff ; j++)
				{
					System.out.print(a[i] + j);
				}
			}
			else
			{
				System.out.print("\nNO Missing Elements...");
			}
		}
	}
}