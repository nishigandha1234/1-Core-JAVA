class StringQuestion
{
	public static void main(String x[])
	{
		String str = "a,b,,,,c";
		String[] s = str.split(",");
		System.out.println(s.length);
	}
}