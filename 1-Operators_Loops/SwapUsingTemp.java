class SwapUsingTemp
{
	public static void main(String[] x)
	{
		int a = 70;
		int b = 40;
		
		int temp = a;
		a = b;
		b = temp;
	
		System.out.println(a);
		System.out.println(b);
	}
}
