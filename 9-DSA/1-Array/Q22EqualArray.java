import java.util.Scanner;

class Q22EqualArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size in Second Array : ");
		int size1 = sc.nextInt();
		System.out.println("Enter the Values in First Array : ");
		int a[] = new int[size1];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Size in Second Array : ");
		int size2 = sc.nextInt();
		System.out.println("Enter Values in Second Array : ");
		int b[] = new int[size2];
		for(int i = 0 ; i < b.length ; i++)
		{
			b[i] = sc.nextInt();
		}
		
		if(a.length != b.length)
			System.out.println("Arrays are NOT Equal");
		
		boolean flag = true;
		
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != b[i])
			{
				flag = false;
				break;
			}
		}
		if(flag) System.out.println("Arrays are Equal");
		else System.out.println("Arrays are NOT Equal");
	}
}