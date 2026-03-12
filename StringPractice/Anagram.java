class Anagram
{
	public static void main(String x[])
	{
		String str1 = "silent";
		String str2 = "listen";
		
		char[] a = str1.toCharArray();
		char[] b = str2.toCharArray();
		
		a.sort();
		b.sort();
	}
}