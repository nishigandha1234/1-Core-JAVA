//frequency of array element

class FrequeOfEle
{
	public static void main(String x[])
	{
		int[] a= {1,1,1,2,2,3,3,3,4,4,4,4};
		int count = 1 , i = 0;
		
		for(i = 1 ; i < a.length ; i++)
		{
			if(a[i-1] == a[i])
			{
				count++;
			}
			else
			{
				System.out.println(a[i-1]+"-->"+count);
				count = 1;
			}
		}
		System.out.println(a[i-1]+"-->"+count);
	}
}