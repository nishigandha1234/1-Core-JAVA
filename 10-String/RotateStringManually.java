
class RotateStringManually
{
	public static void main(String x[])
	{
		String s = "abcde";
		int k = 2;
		
		System.out.println(rotate(s,k));
	}
	public static String rotate(String s,int k)
	{
		char [] ch = s.toCharArray();
		
		k %= ch.length;
		
		for(int i = 0 ; i < k ; i++)
		{
			char temp = ch[0];
			for(int j = 0 ; j < ch.length-1 ; j++)
			{
				ch[j] = ch[j+1];
			}
			ch[ch.length-1] = temp;
		}
		return new String(ch);
	}
}