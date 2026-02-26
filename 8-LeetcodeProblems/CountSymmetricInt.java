//2843

public class CountSymmetricInt
{
	public static void main(String x[])
	{
		    System.out.println(countSymmetricIntegers(1, 100));
	}
	
    public static int countSymmetricIntegers(int low, int high) 
	{
		int totalCount = 0;
		
		for(int i = low ;  i <= high ; i++)
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
			if(fSum == sSum)
				totalCount++ ;
		}
        return totalCount;
	}
}