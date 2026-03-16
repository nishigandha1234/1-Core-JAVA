import java.util.Scanner;

class BinarySearchApp
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in Array : ");
		int a[] = new int[10];
		for(int i = 0 ; i < a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the Search Key : ");
		int skey = sc.nextInt();
		int index = -1;
		int i = 0 , j = a.length-1 ;
		while(i < j)
		{
			int mid = (i+j) / 2;
			if(a[mid] == skey)
			{
				index = mid;
				break;
			}
			if(a[mid] < skey)
			{
				i = mid+1;
			}
			else
			{
				j = mid-1;
			}
		}
		if(index != -1)
		{
			System.out.println("Value found at index : "+ index);
		}
		else{
			System.out.println("Value NOT found...!");;
		}
	}
}
