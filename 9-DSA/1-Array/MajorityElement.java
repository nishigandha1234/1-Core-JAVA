import java.util.Scanner;

class MajorityElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in an Array : ");
		int a[] = new int[8];
		for(int i =0 ; i<a.length ; i++)
		{
			a[i] = sc.nextInt();
		}
		int count = 0;
		for(int i = 0 ; i < a.length-1 ; i++)
		{
			if(a[i] == a[i+1])
			{
				count++;
			}
			if(count > a[i]/2)
				System.out.println("Majority Element : " + a[i]+" ");
		}
	}
}