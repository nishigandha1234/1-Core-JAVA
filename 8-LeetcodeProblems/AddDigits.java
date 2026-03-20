//leetcode - 258

class AddDigits 
{
	public static void main(String x[])
	{
		System.out.println(addDigits(38));
	}
    public static int addDigits(int num) 
	{
		while(num > 9) //2 > 9
		{
			int sum = 0;
			
			if(num <= 0)
				return 0;
	
			int temp = num; //11
			while(temp !=0) //11!=0
			{ 
				int rem = temp % 10; //1
				sum += rem; //1+1
				temp /= 10;
			}
			num = sum; //2
		}
		
        return num;
    }
}