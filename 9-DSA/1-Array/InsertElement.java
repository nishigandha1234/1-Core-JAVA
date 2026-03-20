import java.util.Scanner;
class InsertElement
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int [] a = {1,2,3,4,5};
		System.out.println("Enter the position : ");
		int pos = sc.nextInt();
		System.out.println("Enter the Element : ");
		int element = sc.nextInt();
		
		int[] ans = new int[a.length+1];
		for(int i = 0 ; i < pos ; i++)
		{
			ans[i] = a[i];
		}
		ans[pos] = element;
		for(int i = pos ; i < a.length ; i++)
		{
			ans[i+1] = a[i];
		}
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+" ");
		}
		
	}
}
