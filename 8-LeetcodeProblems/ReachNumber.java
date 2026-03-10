//754. Reach a Number
//You are standing at position 0 on an infinite number line. There is a destination at position target.

class ReachNumber
{
	public static void main(String x[])
	{
		System.out.println(reachNumber(3));
	}
	public static int reachNumber(int target) 
	{
		target = Math.abs(target); //if -ve make it +ve
		int sum = 0 , steps = 0;
		
		while(sum < target || (sum - target) % 2 != 0)
		{
			steps++;
			sum += steps;
		}
		return steps
    }
}