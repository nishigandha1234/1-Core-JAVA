import java.util.Scanner;

class Q6SearchElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in array : ");
		int a[] = new int[5];
		boolean flag = false;
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Element to search in array : ");
		int ele = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == ele)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println(ele +" Element is Found");
		}
		else
		{
			System.out.println("Element is NOT Found");
		}
	}
}