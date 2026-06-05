import java.util.Scanner;

class DeleteArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int[] a = {10,20,30,40,50,60};
		System.out.println("Enter index to delete : ");
		int k = 3 ;
		int size = a.length;
		if(k < 0 || k > size-1)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			while(k < size-1)
			{	
				a[k] = a[k+1];		
				k++;
			}
			size--;
			for(int i = 0 ; i < size ; i++)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}