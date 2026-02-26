//1523

class CountOddNumbers {
	
	public static void main(String x[])
	{
		System.out.println(countOdds(1,10));
	}
    public static int countOdds(int low, int high) {
        return (high+1)/2-(low/2);
    }
}