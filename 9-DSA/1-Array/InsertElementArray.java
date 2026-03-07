import java.util.Scanner;

class InsertElementArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {11,22,33,44,55};
		int b[] = new int[6];
		int count = 5;
		System.out.println("Enter the Element And Index : ");
		int element = 777;
		int k = sc.nextInt();;
		if(k<0 || k > count)
			System.out.println("Invalid Index Number :");
		
		else
		{
			while(k <= count)
			{
				a[k] = a[k+1];
				k++;
			}
			a[k] = 0;
			count--;
			for(int i = 0 ; i < count ; i++)
			{
				System.out.println(a[i] + " ");
			}
		}
	}
}