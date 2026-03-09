import java.util.Scanner;

class FindElementInArray
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
		System.out.println("Enter the Element find in Array : ");
		int element = sc.nextInt();
		boolean found = false;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			if(a[i] == element)
			{
				System.out.println("Element Found at Index : " + i);
				found = true;
				break;
			}
			else
			{
				System.out.println("-1");
			}
		}
		
	}
}