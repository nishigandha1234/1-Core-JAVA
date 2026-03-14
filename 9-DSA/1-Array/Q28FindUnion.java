import java.util.Scanner;

class Q28FindUnion
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Values in First Array : ");
		int ar1[] = new int[3]; // 1 2 3
		for(int i = 0 ; i < ar1.length ; i++)
		{
			ar1[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Values in Second Array : ");
		int ar2[] = new int[5]; // 1 2 3 4 5 
		for(int i = 0 ; i < ar2.length ; i++)
		{
			ar2[i] = sc.nextInt();
		}
		int ans[] = new int[ar1.length+ar2.length];
		int k = 0;
		//{1 2 3}
		for(int i = 0 ; i < ar1.length ; i++) // for 1st array
		{
			ans[k++] = ar1[i];
		}
		//{1,2,3,4,5}
		for(int i = 0 ; i < ar2.length ; i++)
		{
			boolean flag = false;
			for(int j = 0 ; j < ar1.length ; j++)
			{
				if(ar2[i] == ar1[j])
				{
					flag = true;
					break;
				}
			}
			if(!flag)
			{
				ans[k++] = ar2[i];
			}
		}
		System.out.print("Union Array is  : "); 
		for(int i = 0 ; i < k ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}