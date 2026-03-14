import java.util.Scanner;

class Q34FirstRepeatedElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[7];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int i;
		for(i = 0 ; i < a.length-1 ; i++)
		{
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] == a[j])
				{
					System.out.print("First Element is : " + a[i]);
					return;
				}
			}
		}
	}
}