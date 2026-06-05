//delete element

class DeleteElement
{
	public static void main(String x[])
	{
		int[] ar = {1,2,3,4,5};
		int k = 2;
		int count = ar.length;
		
		if(k < 0 || k > count-1)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			while(k < count-1)
			{
				ar[k] = ar[k+1];
				k++;
			}
			ar[k] = 0;
			count--;
			for(int i = 0 ; i < count ; i++)
			{
				System.out.print(ar[i]+" ");
			}
		}
	}
}