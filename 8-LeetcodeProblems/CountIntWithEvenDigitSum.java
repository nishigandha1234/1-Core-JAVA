/*2180. Count Integers With Even Digit Sum
Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.The digit sum of a positive integer is the sum of all its digits.
Example 1: Input: num = 4 Output: 2
Explanation:The only integers less than or equal to 4 whose digit sums are even are 2 and 4.*/

class CountIntWithEvenDigitSum
{
	public static void main(String x[])
	{
		int num = 30;
		System.out.println(countEven(num));
	}
	public static int countEven(int num) 
	{
		int count =0;
        int i = 1;
		while(i <= 9 && i <= num)
		{
			if(i%2 == 0)
			{
				count++;
			}
			i++;
		}
		while(i > 9 && i <= num)
		{
			int sum = 0;
			int temp = i ;
			while(temp != 0) //1
			{
				sum += temp % 10; //sum = 1
				temp/=10; //1
			}
			if(sum % 2 == 0)
			{
				count++;
			}
			i++;
		}
		return count;
    }
}