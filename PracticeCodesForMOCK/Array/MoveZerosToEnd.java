class MoveZerosToEnd
{
	public static void main(String x[])
	{
		int[] a = {10,0,30,0,0,50};
		int count = 0;
		int[] ans = new int[a.length];
		for(int i = 0 ; i < a.length ; i++)
		{
			if(a[i] != 0)
			{
				ans[count++] = a[i]; 
			}
		}
		for(int i = count ; i < a.length; i++)
		{
			ans[count++] = 0;
		}
		for(int i = 0 ; i < ans.length ; i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
}