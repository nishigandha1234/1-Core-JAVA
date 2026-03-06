//202. Happy Number

//Starting with any positive integer, replace the number by the sum of the squares of its digits.Repeat the process

class HappyNumber
{
	public static void main(String x[])
	{
		isHappy();
	}
	public static void isHappy(int num) // 19
	{
		for(int i = 1 ; i < num ; i++)
		{
			int temp = num;
			int sum = 0;
			while(temp!=0) // 9!=0 1!=0
			{
				int rem = temp%10; //9 1
				int squ = rem*rem; //81 1
				temp/=10; //1
			}
			sum += squ; 
				
				
		}
	}
}
 
