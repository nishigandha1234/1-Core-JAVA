//1 3 7 15 31 63

class Series61
{
	public static void main(String x[])
	{
		int num = 1;
		int diff = 2;
		for(int i = 1 ; i <= 9 ;i++)
		{
			System.out.print(num+" "); //1
			num += diff; //3+4
			diff*=2; //diff=4 
		}
	}
	
}