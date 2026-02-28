//leetcode - 258

class Solution 
{
    public int addDigits(int num) 
	{
        int sum = 0;
        int temp = num;
        while(temp > 0 && temp <= 9)
        {
            int rem = temp % 10;
            sum += rem;
            temp /= 10;
        }
        System.out.println(temp);
    }
}