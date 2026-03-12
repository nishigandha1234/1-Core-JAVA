import java.util.Scanner;

class MajorityElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int a[] = new int[10];
		for(int i =0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		
		int majority = -1;
		
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			int count = 0;
			for(int j = i+1 ; j < a.length ; j++)
			{
				if(a[i] == a[j])
				{
					count++;
				}
			}
			if(count > ((a.length)/2))
			{
				majority = a[i];
				break;
			}
		}
			
		
	}
}