/*55 Recursive reverse string */

class ReverseStringRecursion55
{
	public static void main(String x[])
	{
		String s = "abc";
		System.out.println(reverse(s));
	}
	public static String reverse(String s)
	{
		if(s.length() == 0)
		{
			return s;
		}
		return reverse(s.substring(1))+s.charAt(0);
	}
}