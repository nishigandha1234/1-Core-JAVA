//missing element

class MissingElement
{
	public static void main(String x[])
	{
		int[] ar = {1,2,4,6,7};
		for(int i = 0 ; i < ar.length ; i++)
		{
			int diff = ar[i+1]-ar[i];
			
			if(diff > 1)
			{
				for(int j = 1 ; j < diff ; j++)
				{
					System.out.println(ar[i]+j);
				}
			}
		}
	}
}