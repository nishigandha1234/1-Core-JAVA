//66. Plus One
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's. Increment the large integer by one and return the resulting array of digits.

class PlusOne
{
	public static void main(String x[])
	{
		int digits[] = {0};
		int res[] = plusOne(digits);
		for(int i = 0 ; i < res.length ; i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	public static int[] plusOne(int[] digits) 
	{int i;
        for( i = digits.length-1 ; i >= 0 ; i--)
		{
			if(digits[i] < 9)
			{
				digits[i] += 1;
				return digits;
			}
			digits[i] = 0;
		}
		if(digits[i] == 0)
		{
			digits[i] = 1;
		}
		else
		{
			int ar[] = new int[digits.length + 1];
			ar[0] = 1;
		}
		return ar
    }
}