//633. Sum of Square Numbers
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c. 
class SumOfSquare 
{	
	public static void main(String x[])
	{
		judgeSquareSum(5);
	}
    public static void judgeSquareSum(int c) 
	{
        long i = 0 ;
        long j = (long) Math.sqrt(c);
		
        while(i <= j)
        {
            long sum = i*i + j*j;

            if(sum == c)
			{
                System.out.println("Sum is Equal");
				return;
			}
            
            else if(sum < c)
                i++;
            
            else
                j--;
        }
		System.out.println("No such Elements Found");
    }
}