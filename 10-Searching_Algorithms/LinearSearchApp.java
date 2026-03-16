import java.util.Scanner;

class LinearSearchApp
{
	public static void main(String x[])
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[6];
		int index = -1;
		for(int i = 0 ; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Search key : ");
		int skey = sc.nextInt();
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] == skey)
			{
				index = i;
				break;
			}
		}
		if(index != -1)
		{
			System.out.println("Search Key is found at Index : " + index) ;
		}
		else
		{
			System.out.println("Search Key is NOT found..!") ;
		}
	}
}