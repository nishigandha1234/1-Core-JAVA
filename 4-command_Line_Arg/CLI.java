class CLI
{
	public static void main(String x[])
	{
		int a = Integer.parseInt(x[0]);
		
		if(a%2 == 1)
			System.out.println("Odd");
		else
			System.out.println("Even ");
	}
}