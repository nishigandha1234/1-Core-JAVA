//3099-Harshad Number
//An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.

class HarshadNumber
{
	public static void main(String x[])
	{
		System.out.println(sumOfTheDigitsOfHarshadNumber(18));
	}
	public static int sumOfTheDigitsOfHarshadNumber(int x) 
	{
		int sum = 0 , temp = x;
		while(temp != 0) //18
		{
			int rem = temp%10; //18
			sum += rem;
			temp/=10;
		}
		if(x%sum== 0)
		{
			return sum;
		}
		else
		{
			return -1;
		}
    }
}