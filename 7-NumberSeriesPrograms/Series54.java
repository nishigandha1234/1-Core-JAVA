//1  2  4  7  11  16  22  29  37  46
class Series54
{
	public static void main(String x[])
	{
		int diff = 1;
		int num = 1;
		for(int i = 1 ; i<= 9 ; i++)
		{
			num += diff;
			System.out.print(num+" ");
			diff++;
		}
	}
}