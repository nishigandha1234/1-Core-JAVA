/*83 Smallest word in sentence —*/

class SmallestWordinSentence83
{
	public static void main(String x[])
	{
		String s = "Friend In Need is Indeed";
		System.out.println(smallestWord(s));
	}
	public static String smallestWord(String s)
	{
		String[] str = s.split(" ");
		String small = str[0];
		
		for(int i = 0 ; i < str.length ; i++)
		{
			if(small.length() > str[i].length())
			{
				small = str[i];
			}
		}
		return small;
	}	
}