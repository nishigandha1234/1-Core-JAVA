import java.util.Scanner;

class EqualArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size and Values in First Array : ");
		int size1 = sc.nextInt();
		int a[] = new int[size1];
		System.out.println("Enter the Size and Values in Second Array : ");
		int size2 = sc.nextInt();
		int b[] = new int[size2];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i = 0 ; i < b.length ; i++)
		{
			b[i] = sc.nextInt();
		}
		
		if(a.length != b.length)
			System.out.println("Arrays are NOT Equal");
		
		boolean flag = false;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != b[i])
			{
				flag = flase;
				break;
			}
		}
	}
}