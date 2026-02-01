public class PrintASCII
{
	public static void main(String x[])
	{
		char ch = 'A';
		int i = 'A';
		while(ch <= 'Z')
		{
			System.out.println(ch + " : " + i);
			ch++;
			i++;
		}
	}
}