/*788. Rotated Digits
An integer x is a good if after rotating each digit individually by 180 degrees, we get a valid number that is different from x. Each digit must be rotated - we cannot choose to leave it alone.Given an integer n, return the number of good integers in the range [1, n].
Example 1: Input: n = 10 Output: 4*/

class RotatedDigits
{
	public static void main(String x[])
	{
		int n = 20; 
		System.out.println(rotatedDigits(n));
	}
	public static int rotatedDigits(int n) 
	{
		int count = 0;
		
		for(int i = 1 ; i <= n ; i++)
		{
			if(isGoodNum(i))
			{
				count++;
			}
		}
		return count;
    }
	public static boolean isGoodNum(int num)
	{
		boolean flag = false;
		
		while(num != 0)
		{
			int rem = num % 10;
			
			if(rem == 3 || rem == 4 || rem == 7 )
			{
				return false;
			}
			if(rem == 2 || rem == 5 || rem == 6 || rem == 9 )
			{
				flag = true;
			}
			num /= 10;
		}
		return flag;
	}
}