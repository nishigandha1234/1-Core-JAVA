//2843

public class CountSymmetricInt
{
	public static void main(String x[])
	{
		
	}
    public int countSymmetricIntegers(int low, int high) 
	{
		int n = 1230;
		for(int i =1200 ; i<=n ; i++)
		{
			int num = i, count = 0;
			int temp = num;
			while(temp != 0)
			{
				count++;
				temp/=10;
			}
			int pow = 1;
		
			for(int j = 1 ; j <= count/2 ; j++)
			{
				pow*=10;
			}
			int first = num/pow;
			int sec = num%pow;
			int fSum = 0, sSum = 0;
			while(first != 0)
			{
				int fRem = first % 10;
				fSum += fRem;
				first/=10;
			}
			while(sec != 0)
			{
				int sRem = sec % 10;
				sSum += sRem;
				sec/=10;
			}
			System.out.print(fSum == sSum ? num+" " : "");
		}
        return low, high;
    }
}