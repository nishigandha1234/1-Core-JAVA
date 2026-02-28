//633. Sum of Square Numbers
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

class SumOfSquare 
{	
	public static void main(String x[])
	{
		System.out.println(judgeSquareSum(5));
	}
    public boolean judgeSquareSum(int c) 
	{
        long i = 0 ;
        long j = (long) Math.sqrt(c);

        int left = 0;
        int right = 0;

        while(left <= right)
        {
            int sum = left*left + right*right;

            if(sum == c)
            {
                return true;
            }
            else if(sum < c)
            {
                left++;
            }
            else
            {
                right--;
            }
            return false;
        }
    }
}