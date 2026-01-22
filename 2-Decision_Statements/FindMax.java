public class FindMax
{
	int[] ar = {11,12,13,14,15};
	int max = ar[0];
	for(int num : ar)
	{
		if(num > max)
		{
			max = num;
		}
	}
	System.out.println(max);
}