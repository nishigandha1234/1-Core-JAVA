class FindSecMax
{
	public static void main(String x[])
	{
		int[] a = {1,2,3,4,5,6};
		int max = a[0], secMax = a[0];
		
		for(int i = 0 ; i <a.length; i++)
		{
			if(a[i] > max)
			{
				secMax = max;
				max = a[i];
			}
			if( a[i] > secMax && a[i] != max)
			{
				secMax = a[i];
			}
		}
		System.out.println(secMax);
		
	}

}