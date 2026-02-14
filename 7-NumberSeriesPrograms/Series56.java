//7  10  15  22  31  42  55  70
class Series56
{
	public static void main(String x[])
	{
		int diff = 3, num = 7;
		for(int i = 1 ; i<=8 ; i++)
		{
			System.out.print(num+" ");
			num = num+diff;
			diff+=2;
		}
	}	
}