/*LCM bruteForce Approach*/

class LCMSimple
{
	public static void main(String x[])
	{
		int a = 12, b = 18;
		
		for(int i = 3 ; i <= i*i; i++)
		{
			if(i%a==0 && i%b == 0)
			{
				System.out.println(i);
				break;
			}
		}
	}
}