/* Write a java program to check Number Is happy Number or Not happy using function recursion.*/

class HappyNumberRecursion
{
	public static void main(String x[])
	{
		int num = 19;
		Syste
		System.out.println(isHappy(num));
	}
	public static boolean isHappy(int num)
	{
		if(num == 1)
			return true;
		int sum = squareSum(num);
		return isHappy(sum);
	}
	public static int squareSum(int num)
	{
		int sum = 0 ;
		
		while(num != 0)
		{
			int rem = num% 10;
			sum += rem*rem;
			num/=10;
		}
		return sum;
	}
}