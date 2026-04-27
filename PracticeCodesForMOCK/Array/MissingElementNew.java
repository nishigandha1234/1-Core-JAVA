//missing element

class MissingElementNew
{
	public static void main(String x[])
	{
		int[] ar = {1,2,4,5,6,7};
		for(int i = 0 ; i < ar.length-1 ; i++)
		{
			int diff = ar[i+1]-ar[i];
			
			if(diff > 1)
			{
				System.out.println("Missing Element are : ");
				for(int j = 1 ; j < diff ; j++)
				{
					System.out.println(ar[i]+j);
				}
			}
			else
			{
				System.out.println("No Missing Element");
				break;
			}
		}
	}
}