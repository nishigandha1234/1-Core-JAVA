//3   6   12   24   48   96  192 
//(Each term doubles from the previous term starting at 3)

class Series60
{
	public static void main(String x[])
	{
		int num = 3;
		for(int i = 1 ; i<= 9 ; i++)
		{
			System.out.print(num+" ");
			num*=2;
		}
	}
}