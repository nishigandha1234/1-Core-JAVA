/*remove duplicate in array*/

class RemoveDuplicate
{
	public static void main(String x[])
	{
		int[] a = {10,20,10,30,30,40};
		int[] ans = new int[a.length];
		int k = 0;
		for(int i = 0 ; i < a.length ; i++)
		{
			boolean flag = false;
			
			for(int j = 0 ; j < k ; j++)
			{
				if(a[i] == ans[j])
				{
					flag = true;
					break;
				}
			}
		}
		for(int i = 0 ; i < ans.length ; 
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}