public class PrintASCIISmall
{
	public static void main(String x[])
	{
		char ch = 'a';
		int i = 'a';
		while(ch <= 'z')
		{
			System.out.println(ch + " : " + i);
			ch++;
			i++;
		}
	}
}