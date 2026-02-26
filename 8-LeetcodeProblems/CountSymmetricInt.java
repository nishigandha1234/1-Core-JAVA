//2843

public class CountSymmetricInt
{
	public static void main(String x[])
	{
		int n = 100;
		for(int i =1 ; i<=n ; i++)
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
			System.out.println(fSum == sSum ? num : "");
		}
	}
	/*
    public int countSymmetricIntegers(int low, int high) 
	{
		for(low = 1 ; low <= high ; low++)
		{
			if(low < high)
			{
				
			}
		}
        return low, high;
    }/*
}