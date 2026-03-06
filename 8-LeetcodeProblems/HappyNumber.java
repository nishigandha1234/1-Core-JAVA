//202. Happy Number

//Starting with any positive integer, replace the number by the sum of the squares of its digits.Repeat the process

class HappyNumber
{
	public static void main(String x[])
	{
		isHappy(198);
	}
	public static void isHappy(int num) // 19
	{
		int temp = num;
		while(temp != 1&& temp != 4)
		{
			int sum = 0;
			while(temp!=0) // 9!=0 1!=0
			{
				int rem = temp%10; //9 1
				int squ = rem*rem; //81 1
				sum += squ; 
				temp/=10; //1
			}
			temp = sum;
		}
		if(temp == 1) System.out.println("Happy Number");
		else System.out.println("NOT Happy Number");
	}
}
 
