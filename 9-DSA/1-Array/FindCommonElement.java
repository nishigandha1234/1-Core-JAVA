import java.util.Scanner;

class FindCommonElement
{
	public static void main(String x[])
	{
		Scanner 
		int[] a = new int[];
		int[] b = new int[];
		
		for(int i = 0 ; i < a.length ; i++)
		{
			for(int j = 0 ; j < b.length ; j++)
			{
				if(a[i] == b[j])
				{
					System.out.println(b[j] + " ");
				}
			}
		}
	}
}