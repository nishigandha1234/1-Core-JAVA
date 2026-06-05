//rotation by n times

class RotationsByNtimes
{
	public static void main(String x[])
	{
		int[] ar = {1,2,3,4,5};
		int n = 3;
		
		for(int i = 0 ; i < n ; i++)
		{
			int temp = ar[0] ;
			for(int j = 0 ; j < ar.length-1 ; j++)
			{
				ar[j] = ar[j+1];
			}	
			ar[ar.length-1] =temp;
		}
		
		System.out.println("After Rotation Array : ");
		for(int i = 0 ; i < ar.length ; i++)
		{
			System.out.print(ar[i] + " ");
		}
	}

}