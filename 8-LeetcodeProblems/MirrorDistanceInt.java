//3783. Mirror Distance of an Integer
//Define its mirror distance as: abs(n - reverse(n))​​​​​​​ where reverse(n) is the integer formed by reversing the digits of n.Return an integer denoting the mirror distance of n​​​​​​​. abs(x) denotes the absolute value of x.

class MirrorDistanceInt
{
	public static void main(String x[])
	{
		int n = 25;
		System.out.println(mirrorDistance(n));
	}
	public static int mirrorDistance(int n) 
	{
        int rev = 0 ;
        int temp = n;
		
        while(temp != 0)
        {
            rev = rev*10+(temp%10);
			temp /=10;
        }
		return Math.abs(n-rev);
    }
}
 