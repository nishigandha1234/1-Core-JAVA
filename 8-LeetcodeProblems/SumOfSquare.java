//633. Sum of Square Numbers
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.

class SumOfSquare 
{	
	public static void main(String x[])
	{
		System.out.println(judgeSquareSum(5));
	}
    public static boolean judgeSquareSum(int c) 
	{
        long i = 0 ;
        long j = (long) Math.sqrt(c);
		
        while(i <= j)
        {
            int sum = i*i + j*j;

            if(sum == c)
            {
                return true;
            }
            else if(sum < c)
            {
                i++;
            }
            else
            {
                j--;
            }
            return false;
        }
    }
}