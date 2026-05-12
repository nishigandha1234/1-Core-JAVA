/*2544. Alternating Digit Sum
You are given a positive integer n. Each digit of n has a sign according to the following rules: The most significant digit is assigned a positive sign. Each other digit has an opposite sign to its adjacent digits.Return the sum of all digits with their corresponding sign.
Example 1: Input: n = 521 Output: 4*/

class AlternatingDigitSum
{
	public static void main(String x[])
	{
		int n = 111;
		System.out.println(alternateDigitSum(n));
	}
	public static int alternateDigitSum(int n) 
	{
        int ans = 0, div = 1;
		int temp = n; // 521
		
		while(temp / div >= 10)
		{
			div *= 10; // 100
		}
		//521
		
		boolean flag = true;
		while( div > 0)
		{
			//div =10
			int rem = temp / div; //2
			temp = temp % div; //1
			
			if(flag)
			{
				ans += rem; //5
				flag = false;
			}
			else
			{
				ans -= rem; //3
				flag = true;
			}
			
			div/=10;
		}
		return ans;
    }
}