class Demo
{
	Demo()
	{
		System.out.println("This is Constructor");
	}
	static void Demo()
	{	
		System.out.println("This is Method");
	}
	public static void main(String x[])
	{
		Demo d = new Demo();
		Demo.Demo();
	}
}