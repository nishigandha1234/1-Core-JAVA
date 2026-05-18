/*42. Function to swap two numbers */

class SwapTwoNumbers42
{
	public static void main(String x[])
	{
		int n1 = 10, n2 = 5;
		swapNumbers(n1, n2);
	}
	public static void swapNumbers(int n1 , int n2)
	{
		int temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("n1 : " + n1);
		System.out.println("n2  : " + n2);
	}
}